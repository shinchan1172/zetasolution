package com.he.addressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class AddressBook {

	List<Contact> contactName;
	public AddressBook() {
		contactName = new CopyOnWriteArrayList<Contact>();
	}

	public void addContact(Contact contact) throws Exception {

		System.out.println("Adding contact with name "+ contact.getName());
		if (contactName.stream().anyMatch(c->c.getName().equalsIgnoreCase(contact.getName()))) {
			throw new Exception("contact name already exits in database");
		} else {
			contactName.add(contact);
		}
	}

	public void deleteContact(String name) throws Exception {
		System.out.println("delete contact with name "+ name);		
		if (contactName.stream().anyMatch(c->c.getName().equalsIgnoreCase(name))) {
			contactName.removeIf(c->c.getName().equalsIgnoreCase(name));
		} else {
			throw new Exception("No contact exists with name : "+ name);
		}
	}

	public void updateContact(String name, Contact contact) throws Exception {

		System.out.println("update contact with name : "+ name);

		if (contactName.stream().anyMatch(c->c.getName().equalsIgnoreCase(name))) {
			for (Contact c : contactName) {
				if (c.getName().equalsIgnoreCase(name)) {
					System.out.println("yes got it");
					if (c.getAddresses().equals(contact.getAddresses()) 
							&& c.getOrganisation().equals(contact.getOrganisation())
							&& c.getPhoneNumbers().equals(contact.getPhoneNumbers())) {
						throw new Exception("Nothing to update");
					}
					contactName.remove(c);
					contactName.add(contact);
				}
			}
		} else {
			throw new Exception("Not found contact name to update");
		}
	}

	public List<Contact> searchByName(String name) {

		System.out.println("search by contact name "+ name);
		if (contactName.stream().anyMatch(c->c.getName().toLowerCase().startsWith(name.toLowerCase()))) {
			return contactName.stream().filter(c->c.getName().toLowerCase().startsWith(name.toLowerCase())).collect(Collectors.toList());
		} else if (name.isEmpty()) {
			return contactName;
		} 
		return null; 
	}

	public List<Contact> searchByOrganisation(String organisation) {
		System.out.println("search by contact organisation "+ organisation);

		if (contactName.stream().anyMatch(c->c.getOrganisation().toLowerCase().startsWith(organisation.toLowerCase()))) {
			List<Contact> list = contactName.stream().filter(c->c.getOrganisation().toLowerCase().startsWith(organisation.toLowerCase())).collect(Collectors.toList());
			return list;
		} else if (organisation.isEmpty()) {
			return contactName;
		}  
		return new ArrayList<Contact>();
	}

}