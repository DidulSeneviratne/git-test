package com.api.demo2;

import java.util.List;

public interface EmpService {
	
	public List<Employee> getEmployeeList();
	public List<Employee> findByEmpId(int id);
	public List<Employee> findByEmpName(String name);
	public List<Employee> findByEmpDep(String department);
	public List<Employee> findBySearchString(String searchKeyword);
	public List<Employee> findByNameAndDepartment(String name, String department);
	public List<Employee> saveEmployee(Employee emp);
	public List<Employee> updateEmployee(Employee emp);
	public List<Employee> deleteEmployee(Employee emp);
	
}
