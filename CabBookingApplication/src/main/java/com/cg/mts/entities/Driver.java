package com.cg.mts.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Driver extends AbstractUser {
	
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "driver_Sequence")
//    @SequenceGenerator(name = "drive_Sequence", sequenceName = "DRIVER_SEQ", initialValue = 101)
//	private int driverId;
	
	private String licenseNo;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "cabId")
	private Cab cab;
	
	private float rating;
	
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Driver(long joinId, String username, String password, String mobileNumber, String email, 
			String licenseNo, Cab cab, float rating) {
		super(joinId, username, password, mobileNumber, email);
		//this.driverId = driverId;
		this.licenseNo = licenseNo;
		this.cab = cab;
		this.rating = rating;
	}


//int driverId,
//	public int getDriverId() {
//		return driverId;
//	}
//
//	public void setDriverId(int driverId) {
//		this.driverId = driverId;
//	}

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