package com.api.demo2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomoController {
	
	@Autowired
	public EmpService service;

	@GetMapping("/getall")
	public List<Employee> getEmployees(){
		return service.getEmployeeList();
	}
	
	@GetMapping("/getbyid/{id}")
	public List<Employee> getEmployeeById(@PathVariable("id")int id){
		return service.findByEmpId(id);
	}
	
	@GetMapping("/getbyname/{name}")
	public List<Employee> getEmployeeByName(@PathVariable("name")String name){
		return service.findByEmpName(name);
	}
	
	@GetMapping("/getbydep/{department}")
	public List<Employee> getEmployeeByDepartment(@PathVariable("department")String department){
		return service.findByEmpDep(department);
	}
	
	@GetMapping("/getbykeyword/{searchString}")
	public List<Employee> getEmployeeBySearchString(@PathVariable("searchString")String searchString){
		return service.findBySearchString(searchString);
	}
	
	@GetMapping("/getbyname_and_dep/{name}/{department}")
	public List<Employee> getEmployeeByNameAndDep(@PathVariable("name")String name,@PathVariable("department")String department){
		return service.findByNameAndDepartment(name,department);
	}
	
}
