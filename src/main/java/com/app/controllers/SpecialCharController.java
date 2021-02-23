package com.app.controllers;

import static com.app.utilities.SpecialCharUtility.includeOrNot;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Employee;;

@RestController
@RequestMapping("/specialChar")
public class SpecialCharController {
	
	@PostMapping("/remove")
	ResponseEntity<?> specialCharRemoval(@RequestBody Employee emp){
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("Message", "Emp verified Successfully");
		
		includeOrNot(emp.getEmployeeName(), "EmployeeName", map);
		includeOrNot(emp.getAddress(), "Address", map);
		includeOrNot(emp.getSalary(), "Salary", map);
		includeOrNot(emp.getDepartment(), "Department", map);
		includeOrNot(emp.getPincode(), "Pincode", map);
		includeOrNot(emp.getState(), "State", map);
		includeOrNot(emp.getCountry(), "Country", map);
		
		return new ResponseEntity<>(map, HttpStatus.OK);
	}
}
