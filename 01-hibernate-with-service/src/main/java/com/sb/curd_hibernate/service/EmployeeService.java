package com.sb.curd_hibernate.service;

import java.util.List;

import com.sb.curd_hibernate.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public void saveEmployee(Employee employee);
	
	public void deleteById(int id);

}
