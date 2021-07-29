package com.cg.mts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cg.mts.entities.Admin;
import com.cg.mts.entities.TripBooking;
import com.cg.mts.service.AdminService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@PostMapping("/insertadmin")
	public Admin insertAdmin(@RequestBody Admin admin) {
		// TODO Auto-generated method stub
		return this.adminService.insertAdmin(admin);
	}
	
	@PutMapping("/updateadmin/{id}")
	public Admin updateAdmin(@RequestBody Admin admin,@PathVariable("id") long id) {
		return adminService.updateAdmin(admin,id);
	}
	
	@DeleteMapping("/deleteadmin/{id}")
	public ResponseEntity<Admin> deleteAdmin(@PathVariable("id") long id) {
		return adminService.deleteAdmin(id);
	}
	
	@GetMapping("/getalltrips")
	public List<TripBooking> getAllTrips() {
		return adminService.getAllTrips();
	}
	
	@GetMapping("/gettripscabwise/{cabId}")
	public List<TripBooking> getTripsCabwise(@PathVariable("cabId") int cabId) {
		return adminService.getTripsCabwise(cabId);
	}
	
	@GetMapping("/gettripscustomerwise/{customerId}")
	public List<TripBooking> getTripsCustomerwise(@PathVariable("customerId") long customerId) {
		return adminService.getTripsCustomerwise(customerId);
	}
	
	@GetMapping("/gettripsdatewise/{date}")
	public List<TripBooking> getTripsDatewise(@PathVariable("date") String date) {
		return adminService.getTripsDatewise(date);
	}
	
	@GetMapping("/getalltripsfordays/{customerId:.+}/{fromDate:.+}/{toDate:.+}")
	public List<TripBooking> getAllTripsForDays (@PathVariable("customerId")long customerId,@PathVariable("fromDate") String fromDate,@PathVariable("toDate") String toDate) {
		return adminService.getAllTripsForDays(customerId, fromDate, toDate);
	}

}
