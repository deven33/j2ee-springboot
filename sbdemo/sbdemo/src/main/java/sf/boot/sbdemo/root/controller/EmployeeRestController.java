package sf.boot.sbdemo.root.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import sf.boot.sbdemo.root.entity.Employee;
import sf.boot.sbdemo.root.service.EmployeeImpl;

@RestController
public class EmployeeRestController {
	
	private EmployeeImpl employeeImpl;
	
	@Autowired
	public EmployeeRestController(EmployeeImpl employeeImpl) {
		this.employeeImpl = employeeImpl;
	}
	
	@GetMapping("/employee")
	public List<Employee> findAll() {
		return employeeImpl.findAll();
	}
	
}
