package com.example.contact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.contact.dao.ContactRepository;
import com.example.contact.model.Contact;

@Service
public class ContactService {

	@Autowired
	ContactRepository contactRepository;

	public Contact saveContactDetails(Contact contact) {
		
		return contactRepository.save(contact);
	}

	public List<Contact> getAllContacts(String postalCode) {
		if(postalCode!=null)
		{
			return contactRepository.findByAddressPostalCode(postalCode);
		}
		return contactRepository.findAll();
	}
}
