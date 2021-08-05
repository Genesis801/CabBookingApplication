package com.cg.mts.servicetest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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

import com.cg.mts.entities.Cab;
import com.cg.mts.entities.Customer;
import com.cg.mts.entities.Driver;
import com.cg.mts.repository.IDriverRepository;
import com.cg.mts.service.DriverService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DriverServiceTest {
	@Autowired
	private DriverService driverService;

	@MockBean
	private IDriverRepository driverRepo;
	
	
	
	  @Test 
	  public void insertDriverTest(){ 
	  Cab cab= new Cab(10001,"sedan",20.50f);
	  Driver driver= new Driver(301,"mukesh","abcd","7594621835","mukesh@gmail.com",101,"845762",cab,4.6f); 
	  Mockito.when(driverRepo.save(driver)).thenReturn(driver);
	  assertEquals(driver, driverService.insertDriver(driver));
	  
	  }
	  
	  
	  @Test 
	  public void LoginDriverTest(){ 
		  Cab cab= new Cab(10001,"sedan",20.50f);
		  Driver driver = new Driver(301,"mukesh","abcd","7594621835","mukesh@gmail.com",101,"845762",cab,4.6f);
		  List<Driver> driverList= new ArrayList<>();
		  driverList.add(driver);
		  String result = "mukesh is logged in";
		  when(driverRepo.findAll()).thenReturn(driverList);
			assertEquals(result, driverService.LoginDriver(driver));
		  
	  }
	 
	  
	/*
	 * @Test public void updateDriverTest() { Driver driver= new
	 * Driver(301,"mukesh","abcd","7594621835","mukesh@gmail.com",101,"845762",***
	 * cab,4.6f); Driver newdriver= new
	 * Driver(301,"ram","1234","8594631235","ram@gmail.com",101,"845751",***cab,4.5f
	 * ); given(cabRepo.findById(cab.getCabId())).willReturn(Optional.of(cab));
	 * cabService.updateCab(newcab); verify(cabRepo).save(newcab);
	 * verify(cabRepo).findById(cab.getCabId()); }
	 */ 
/*
 * @Test public void deleteDriverTest() { Driver driver= new Driver();
 * driver.setDriverId(101);
 * Mockito.when(driverRepo.findById(driver.getDriverId())).thenReturn(Optional.
 * of(driver)); driverService.deleteDriver(driver.getDriverId());
 * //(cabRepo).delete(cab); verify(driverRepo).deleteById(driver.getDriverId());
 * }
 * 
 * @Test public void viewBestDriversTest() { }
 * 
 * @Test public void viewDriverTest() { } 
 */
}