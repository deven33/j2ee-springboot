package com.sb.curd_hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sb.curd_hibernate.dao.EmployeeDAO;
import com.sb.curd_hibernate.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Override
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}


	@Override
	public Employee findById(int id) {
		return employeeDAO.findById(id);
	}


	@Override
	public void saveEmployee(Employee employee) {
		employeeDAO.saveEmployee(employee);
		
	}


	@Override
	public void deleteById(int id) {
		employeeDAO.deleteById(id);		
	}

	
}