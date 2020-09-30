package com.he.addressBook;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "address")
public class Address {

//	 short description for the address. It must contain only letters of English Alphabets and whitespace. 
//	 It cannot be empty and its length should not exceed 255 characters. Example: "office", "residential".
	
	@Id
	@Column(name = "Id")
	private long id; 
	
	@Column(name = "label")
	private String label;
	
	@Column(name = "address")
	private String address;
	
	@ManyToOne
	@JoinColumn(name = "name")
	private Contact contact;
	
	public Address(String label, String address) throws Exception {
		// TODO
	}
	
	public String getLabel() {
		return this.label;
	}
	
	public String getAddress() {
		return this.address;
	}
}
