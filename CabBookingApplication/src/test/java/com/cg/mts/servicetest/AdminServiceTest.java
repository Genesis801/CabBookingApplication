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

import com.cg.mts.entities.Admin;
import com.cg.mts.repository.IAdminRepository;
import com.cg.mts.service.AdminService;

@RunWith(SpringRunner.class)
@SpringBootTest

public class AdminServiceTest {
	@Autowired
	private AdminService adminService;

	@MockBean
	private IAdminRepository adminRepo;

	@Test
	public void insertAdminTest() {
		Admin ad = new Admin("niharika", "1234", "8459671250", "niharika@gmail.com", 1001);
		Mockito.when(adminRepo.save(ad)).thenReturn(ad);
		assertEquals(ad, adminService.insertAdmin(ad));

	}

	
	  @Test 
	  public void LoginAdminTest() {
		  Admin admin = new Admin("niharika", "1234", "8459671250", "niharika@gmail.com", 1001);
		  List<Admin> adminList= new ArrayList<>();
		  adminList.add(admin);
		  String result = "niharika is logged in";
		  when(adminRepo.findAll()).thenReturn(adminList);
			assertEquals(result, adminService.LoginAdmin(admin));
	  }
	  
	 
	  

	/*
	 * @Test public void deleteAdminTest() { Admin ad = new Admin();
	 * ad.setAdminId(1001);
	 * Mockito.when(adminRepo.findById(ad.getAdminId())).thenReturn(Optional.of(ad))
	 * ; adminService.deleteAdmin(ad.getAdminId());
	 * verify(adminRepo).deleteById(ad.getAdminId());
	 * 
	 * }
	 */ /* 
  * @Test 
  public void updateAdminTest() { }
  @Test public void getAllTripsTest() { }
  
  @Test public void getTripsCabwiseTest() { }
  
  @Test public void getTripsCustomerwiseTest() { }
  
  @Test public void getTripsDatewiseTest() { }
  
  
 */
}