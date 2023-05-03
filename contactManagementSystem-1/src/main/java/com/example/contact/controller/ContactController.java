package com.example.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.contact.model.Contact;
import com.example.contact.service.ContactService;

@RestController
public class ContactController {

	@Autowired
	ContactService contactService;
	@PostMapping("/saveRecords")
	public Contact saveContactDetails(@RequestBody Contact contact)
	{
		return contactService.saveContactDetails(contact);
	}
	@GetMapping("/getByPostalCode/{postalCode}")
	public List<Contact> getAllContacts(@PathVariable("postalCode")String postalCode)
	{
		return contactService.getAllContacts(postalCode);
	}
	
}
