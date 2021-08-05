package com.cg.mts.servicetest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.when;

import com.cg.mts.entities.Admin;
import com.cg.mts.entities.Customer;
import com.cg.mts.repository.ICustomerRepository;
import com.cg.mts.service.CustomerService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceTest {
	@Autowired
	private CustomerService customerService;
	
	@MockBean
	private ICustomerRepository customerRepo;
	
	@Test 
	public void insertCustomerTest(){ 
		Customer cust = new Customer(201,"Rishi","xyza","8695423657","rishi@gmail.com",201);
		Mockito.when(customerRepo.save(cust)).thenReturn(cust); 
		assertEquals(cust, customerService.insertCustomer(cust));
			  
	}

	/*
	 * @Test public void updateCustomerTest(){
	 * 
	 * Customer customer=new
	 * Customer(201,"Rishi","xyza","8695423657","rishi@gmail.com",201); Customer
	 * newCustomer=new
	 * Customer(201,"Vinita","bhhdvc","8595423657","vinita@gmail.com",201);
	 * given(customerRepo.findById(customer.getCustomerId())).willReturn(Optional.of
	 * (customer)); customerService.updateCustomer(newCustomer,201);
	 * verify(customerRepo).save(newCustomer);
	 * verify(customerRepo).findById(customer.getCustomerId()); }
	 * 
	 * 
	 * @Test public void deleteCustomerTest(){ }
	 * 
	 * 
	 * @Test public void viewCustomersTest(){ }
	 * 
	 * 
	 * @Test public void viewCustomerTest(){ }
	 * 
	 * @Test public void validateCustomerTest(){ }
	 */
	@Test
	public void LoginUserTest(){
			  Customer customer = new Customer(201,"Rishi","xyza","8695423657","rishi@gmail.com",201);
			  List<Customer> customerList= new ArrayList<>();
			  customerList.add(customer);
			  String result = "Rishi is logged in";
			  when(customerRepo.findAll()).thenReturn(customerList);
				assertEquals(result, customerService.LoginUser(customer));
		  }
		
	}
	


