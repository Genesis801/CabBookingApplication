package com.cg.mts.entities;

public class Driver extends AbstractUser {
	private int driverId;
	private String licenseNo;
	private Cab cab;
	private float rating;
	
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Driver(String username, String password, String mobileNumber, String email, int driverId, String licenseNo, Cab cab, float rating) {
		super(username, password, mobileNumber, email);
		// TODO Auto-generated constructor stub
		this.driverId = driverId;
		this.licenseNo = licenseNo;
		this.cab = cab;
		this.rating = rating;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public Cab getCab() {
		return cab;
	}

	public void setCab(Cab cab) {
		this.cab = cab;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}
}