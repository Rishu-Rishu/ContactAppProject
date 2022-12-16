/**
 * 
 */
package com.ris.service;

import java.util.List;

import com.ris.binding.Contact;

/**
 * @author Agarw
 *
 */
public interface IContactService {

	public String saveContact(Contact contact);
	public List<Contact> getAllContacts();
	public Contact getContactById(Integer id);
	public String updateContact(Contact contact);
	public String deleteContactById(Integer id);
}
