/**
 * 
 */
package com.ris.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ris.binding.Contact;
import com.ris.service.IContactService;

/**
 * @author Agarw
 *
 */
@RestController
@CrossOrigin
public class ContactRestController {

	@Autowired
	private IContactService service;
	
	@PostMapping("/contact")
	public String createContact(@RequestBody Contact contact) {
		String status = service.saveContact(contact);
		return status;
	}
	
	@GetMapping("/contacts")
	public List<Contact> getAllContacts() {
		List<Contact> list = service.getAllContacts();
		return list;
	}
	
	@GetMapping("/contact/{contactId}")
	public Contact findContact(@PathVariable Integer contactId) {
		return service.getContactById(contactId);
	}
	
	@PutMapping("/contact")
	public String updateContact(@RequestBody Contact contact) {
		return service.updateContact(contact);
	}
	
	@DeleteMapping("/contact/{contactId}")
	public String removeContact(@PathVariable Integer contactId) {
		return service.deleteContactById(contactId);
	}
}
