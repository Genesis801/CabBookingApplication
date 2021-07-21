package com.cg.mts.entities;

public class Admin extends AbstractUser {
	private int adminId;

	public Admin() {
		super();
	}

	public Admin(String username, String password, String mobileNumber, String email, int adminId) {
		super(username, password, mobileNumber, email);
		// TODO Auto-generated constructor stub
		this.adminId = adminId;
	}
}