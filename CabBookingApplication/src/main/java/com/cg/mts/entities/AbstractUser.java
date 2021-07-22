package com.cg.mts.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;



@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class AbstractUser {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "order_Sequence")
    @SequenceGenerator(name = "order_Sequence", sequenceName = "ORDER_SEQ")
	private long joinId;
	
	private String username;
	private String password;
	private String mobileNumber;
	private String email;
	
	public AbstractUser() {

	}


	public AbstractUser(long joinId, String username, String password, String mobileNumber, String email) {

		this.joinId = joinId;
		this.username = username;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	public long getJoinId() {
		return joinId;
	}



	public void setJoinId(long joinId) {
		this.joinId = joinId;
	}
}