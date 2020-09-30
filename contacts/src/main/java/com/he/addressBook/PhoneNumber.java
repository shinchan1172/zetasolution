package com.he.addressBook;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;


@Entity
public class PhoneNumber {
//	label: short description for the phoneNumber.
//	It must contain only letters of English Alphabet and whitespace.
//	It cannot be empty and its length should not exceed 255 characters. Example: "work", "home". 
   
	@Id
	@Column(name = "Id")
	private long id;
	
	@Column(name = "label")
	private String label;
    
//    phoneNumber: It represents the phone number. It should contain exactly 10 digits.
	@Column(name = "phoneNumber")
    private String phoneNumber;

	@ManyToOne
	@JoinColumn(name = "name")
	private Contact contact;
	
	public PhoneNumber () {
		
	}
	
    public PhoneNumber(String label, String phoneNumber) throws Exception {
        // TODO
    	this.label = label;
    	this.phoneNumber = phoneNumber;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
