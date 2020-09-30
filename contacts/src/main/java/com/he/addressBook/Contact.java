package com.he.addressBook;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity(name = "Contact")
public class Contact {

	@Id
	@Column(name = "name")
    private String            name;
	
	@Column(name = "organisation")
    private String            organisation;
	
	@OneToMany(mappedBy = "phoneNumber")
	@NotFound(action = NotFoundAction.IGNORE)
    private List<PhoneNumber> phoneNumbers;
	
	@OneToMany(mappedBy = "address")
	@NotFound(action = NotFoundAction.IGNORE)
    private List<Address> addresses;
	
	Contact() {
		
	}

    public Contact(String name, String organisation) throws Exception {
        // TODO
    	
    	this.name = name;
    	this.organisation = organisation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public void addPhoneNumber(PhoneNumber phoneNumber) {
        if (this.phoneNumbers == null) {
            this.phoneNumbers = new ArrayList<>();
        }
        this.phoneNumbers.add(phoneNumber);

    }

    public void addAddress(Address address) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(address);
    }

}