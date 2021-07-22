package com.cg.mts.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

@Entity
public class Admin extends AbstractUser {
	

	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "admin_Sequence")
    @SequenceGenerator(name = "admin_Sequence", sequenceName = "ADMIN_SEQ", initialValue = 1001)
	private int adminId;
	
	public Admin() {
		super();
	}


	public Admin(long joinId, String username, String password, String mobileNumber, String email, int adminId) {
		super(joinId, username, password, mobileNumber, email);
		this.adminId = adminId;
	}



	public int getAdminId() {
		return adminId;
	}

//	public void setAdminId(int adminId) {
//		this.adminId = adminId;
//	}
//	
	
}