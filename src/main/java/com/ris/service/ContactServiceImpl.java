package com.ris.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ris.binding.Contact;
import com.ris.repository.IContactRepo;
@Service
public class ContactServiceImpl implements IContactService {

	@Autowired
	private IContactRepo repo;
	
	@Override
	public String saveContact(Contact contact) {
		String phNo= repo.save(contact).getPhNo();
		return "Contact Saved having Phone Number:" + phNo;
	}

	@Override
	public List<Contact> getAllContacts() {
		List<Contact> ls = repo.findAll();
		return ls;
	}

	@Override
	public Contact getContactById(Integer id) {
		Contact cont = repo.getById(id);
		return cont;
	}

	@Override
	public String updateContact(Contact contact) {
		String phNo = repo.save(contact).getPhNo();
		return "Contact update having Phone Number:"+phNo;
	}

	@Override
	public String deleteContactById(Integer id) {
		String phNo = repo.getById(id).getPhNo();
		repo.deleteById(id);
		return "Contact Deleted having phone Number:"+phNo;
	}

}
