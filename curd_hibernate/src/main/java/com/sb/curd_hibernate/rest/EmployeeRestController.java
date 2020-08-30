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
	
	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId)  {
		Employee employee = employeeService.findById(employeeId);
		if(employee == null ) {
			throw new RuntimeException("Employee not Found");
		}
		return employee;
		
	}
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee e) {
		e.setId(6);
		employeeService.saveEmployee(e);
		return e;
	}
	
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee e) {
		employeeService.saveEmployee(e);
		return e;
	}
	
	@DeleteMapping("/employees/{id}")
	public String removeEmployee(@PathVariable int id) {
		//get the employee information
		Employee employee = employeeService.findById(id);
		if(employee == null) {
			throw new RuntimeException("Employee not exist");
		}
		employeeService.deleteById(id);
		return "Employee deleted with id "+id;
	}
}
