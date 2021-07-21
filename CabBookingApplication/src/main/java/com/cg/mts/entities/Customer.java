package com.cg.mts.entities;

public class Customer extends AbstractUser {
	private int customerId;

	public Customer() {
		super();
	}

	public Customer(String username, String password, String mobileNumber, String email, int customerId) {
		super(username, password, mobileNumber, email);
		// TODO Auto-generated constructor stub
		this.customerId = customerId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
}
