package com.he.addressBook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	AddressBook addressBook;
	
	@PostMapping({ "/addcontact" })
    public String addingContact(@RequestBody ContactDto c) throws Exception {
		
		Contact contact = new Contact(c.getName(), c.getOrganisation());
		contact.setPhoneNumbers(c.getPhoneNumbers());
		contact.setAddresses(c.getAddresses());
		addressBook.addContact(contact);
		return "success";
    }

}
