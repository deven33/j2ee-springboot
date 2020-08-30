package sf.boot.sbdemo.root.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sf.boot.sbdemo.root.dao.EmployeeDAO;
import sf.boot.sbdemo.root.entity.Employee;

@Service
public class EmployeeImpl implements EmployeeDAO{
	
	private EmployeeDAO employeeDAO;
	
	@Autowired
	public EmployeeImpl(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Override
	@Transactional
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void save(Employee theEmp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

}
