package com.sb.curd_hibernate.dao;

import java.util.List;

import com.sb.curd_hibernate.entity.Employee;

public interface EmployeeDAO {
	public List<Employee> findAll();
	public Employee findById(int id);
	public void addEmp(Employee e);
	public void deleteEmp(int id);
}
