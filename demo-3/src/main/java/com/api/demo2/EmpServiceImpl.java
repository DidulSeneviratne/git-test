package com.api.demo2;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService{

	@Override
	public List<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
		EmpOprs empOprs = new EmpOprs();
		return empOprs.getEmployees();
	}

	@Override
	public List<Employee> findByEmpId(int id) {
		// TODO Auto-generated method stub
		EmpOprs empOprs = new EmpOprs();
		return empOprs.getEmployeeById(id);
	}

	@Override
	public List<Employee> findByEmpName(String name) {
		// TODO Auto-generated method stub
		EmpOprs empOprs = new EmpOprs();
		return empOprs.getEmployeeByName(name);
	}

	@Override
	public List<Employee> findByEmpDep(String department) {
		// TODO Auto-generated method stub
		EmpOprs empOprs = new EmpOprs();
		return empOprs.getEmployeeByDepartment(department);
	}

	@Override
	public List<Employee> findBySearchString(String searchKeyword) {
		// TODO Auto-generated method stub
		EmpOprs empOprs = new EmpOprs();
		return empOprs.getEmployeeBySearchName(searchKeyword);
	}

	@Override
	public List<Employee> findByNameAndDepartment(String name, String department) {
		// TODO Auto-generated method stub
		EmpOprs empOprs = new EmpOprs();
		return empOprs.getEmployeeByNameAndDepartment(name, department);
	}
	
	@Override
	public List<Employee> saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		EmpOprs empOprs = new EmpOprs();
		return empOprs.saveEmployee(emp);
	}

	@Override
	public List<Employee> updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		EmpOprs empOprs = new EmpOprs();
		return empOprs.updateEmployee(emp);
	}

	@Override
	public List<Employee> deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub
		EmpOprs empOprs = new EmpOprs();
		return empOprs.deleteEmployee(emp);
	}
	
}
