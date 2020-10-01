package com.he.addressBook;

public class PhoneNumber {
	
	
	@Override
	public String toString() {
		return "PhoneNumber [label=" + label + ", phoneNumber=" + phoneNumber + "]";
	}

	private String label;
	private String phoneNumber;

	public PhoneNumber(String label, String phoneNumber) throws Exception {

		if (label.isEmpty() || label == null || label.length() >= 255) {
			throw new Exception("invalid label");
		} else {
			this.label = label;
		}
		
		if (phoneNumber.matches("[0-9]+") && phoneNumber.length() == 10) {
			this.phoneNumber = phoneNumber;
		} else {
			throw new Exception("invalid Phone number "+ phoneNumber);
		}
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
