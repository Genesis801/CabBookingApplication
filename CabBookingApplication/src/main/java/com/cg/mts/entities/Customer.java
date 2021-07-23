package com.cg.mts.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer extends AbstractUser{
	
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "customer_Sequence")
//    @SequenceGenerator(name = "customer_Sequence", sequenceName = "CUSTOMER_SEQ", initialValue = 201)
	//private int customerId;

	public Customer() {
		super();
	}

	
	public Customer(long joinId, String username, String password, String mobileNumber, String email, int customerId) {
		super(joinId, username, password, mobileNumber, email);
	}


/*	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	} */
}
