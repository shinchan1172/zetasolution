package com.he.addressBook;

public class Address {

	@Override
	public String toString() {
		return "Address [label=" + label + ", address=" + address + "]";
	}

	private String label;
	private String address;

	public Address(String label, String address) throws Exception {

		if (label.isEmpty() || label == null || label.length() >= 255) {
			throw new Exception("invalid label");

		} else {
			this.label  = label;
			this.address = address;
		}
	}

	public String getLabel() {
		return this.label;
	}

	public String getAddress() {
		return this.address;
	}
}
