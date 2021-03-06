package com.sb.curd_hibernate.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.curd_hibernate.entity.Employee;
import com.sb.curd_hibernate.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	EmployeeService employeeService;
	
	@Autowired
	public EmployeeRestController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/employees1")
	public List<Employee> getAllEmp(){
		return employeeService.findAll();		
	}
	
	@GetMapping("/employees1/{id}")
	public Employee getEmp(@PathVariable int id) {
		Employee emp = employeeService.findById(id);
		if (emp == null ) {
			throw new RuntimeException("Employee not available with id-"+id);
		}
		return emp;
	}
	
	@PostMapping("/employees1")
	public String addEmp(@RequestBody Employee e) {
		employeeService.addEmp(e);
		return "data inserted";
	}
	
}
