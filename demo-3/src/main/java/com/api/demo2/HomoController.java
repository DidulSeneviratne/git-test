package com.api.demo2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomoController {
	
	@Autowired
	public EmpService service;

	@GetMapping("/getall")
	public List<Employee> getEmployees(){
		return service.getEmployeeList();
	}
	
}
