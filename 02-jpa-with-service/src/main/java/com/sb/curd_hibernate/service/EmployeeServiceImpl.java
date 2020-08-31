package com.sb.curd_hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sb.curd_hibernate.dao.EmployeeDAO;
import com.sb.curd_hibernate.entity.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
		super();
		this.employeeDAO = employeeDAO;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeDAO.findAll();
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addEmp(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmp(int id) {
		// TODO Auto-generated method stub
		
	}

	
}
