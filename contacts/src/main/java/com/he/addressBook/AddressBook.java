package com.he.addressBook;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class AddressBook{

	@Autowired
	MyRepository repo;
	
    public AddressBook() {
        //TODO
    }

    public void addContact(Contact contact) {
        //TODO
    	repo.save(contact); 	
    }

    public void deleteContact(String name) {
        //TODO
    }

    public void updateContact(String name, Contact contact) {
        //TODO
    }

    public List<Contact> searchByName(String name) {
        //TODO
        return null;
    }

    public List<Contact> searchByOrganisation(String organisation) {
        //TODO
        return null;
    }
}