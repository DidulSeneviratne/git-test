package com.api.demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmpOprs {
	
	public List<Employee> empList = new ArrayList<Employee>();
	
	public EmpOprs() {
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Kamal Singh");
		emp.setDepartment("HR");
		emp.setSalary(35000);
		empList.add(emp);
		
		Employee emp1 = new Employee();
		emp1.setId(101);
		emp1.setName("Maneesh Khan");
		emp1.setDepartment("Sales");
		emp1.setSalary(42000);
		empList.add(emp1);
		
		Employee emp2 = new Employee();
		emp2.setId(102);
		emp2.setName("Arjun Singh");
		emp2.setDepartment("Sales");
		emp2.setSalary(59000);
		empList.add(emp2);
		
	}
	
	public List<Employee> getEmployees(){
		return empList;
	}
	
	public List<Employee> getEmployeeById(int id){
		List<Employee> newList = empList.stream().filter(e->e.getId()==id).collect(Collectors.toList());
		return newList;
	}
	
	public List<Employee> getEmployeeByName(String name){
		List<Employee> newList = empList.stream().filter(e->e.getName().equals(name)).collect(Collectors.toList());
		return newList;
	}
	
	public List<Employee> getEmployeeByDepartment(String department){
		List<Employee> newList = empList.stream().filter(e->e.getDepartment().equals(department)).collect(Collectors.toList());
		return newList;
	}
	
	public List<Employee> getEmployeeBySearchName(String searchString){
		List<Employee> newList = empList.stream().filter(e->e.getName().contains(searchString)).collect(Collectors.toList());
		return newList;
	}
	
	public List<Employee> getEmployeeByNameAndDepartment(String name, String department){
		List<Employee> newList = empList.stream().filter(e->e.getName().equals(name)&&e.getDepartment().equals(department)).collect(Collectors.toList());
		return newList;
	}
	
	public List<Employee> saveEmployee(Employee emp){
		empList.add(emp);
		return empList;
	}
	
	public List<Employee> updateEmployee(Employee newEmp){
		List<Employee> newList = new ArrayList<>();
		for(Employee oldEmp:empList){
			if(oldEmp.getId()!= newEmp.getId()){
				newList.add(oldEmp);
			}else {
				newList.add(newEmp);
			}
		}
		empList = newList;
		return newList;
	}
	
	public List<Employee> deleteEmployee(Employee newEmp){
		List<Employee> newList = new ArrayList<>();
		for(Employee oldEmp:empList){
			if(oldEmp.getId()!= newEmp.getId()){
				newList.add(oldEmp);
			}
		}
		empList = newList;
		return newList;
	}
}