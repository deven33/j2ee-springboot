package com.sb.curd_hibernate.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.curd_hibernate.dao.EmployeeDAO;
import com.sb.curd_hibernate.entity.Employee;
import com.sb.curd_hibernate.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeRestController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/employees")
	public List<Employee> findAll() {
		return employeeService.findAll();
		
	}
	
	@SuppressWarnings("unchecked")
	@GetMapping("/employeeId")
	public List<Employee> findById(int id) {
		return (List<Employee>) employeeService.findById(id);
		
	}
	
}
