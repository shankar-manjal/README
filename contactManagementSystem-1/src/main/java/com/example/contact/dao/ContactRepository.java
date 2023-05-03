package com.example.contact.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.contact.model.Contact;
@Repository
public interface ContactRepository extends JpaRepository<Contact,Long>{
List<Contact> findByAddressPostalCode(String postalCode);
}
