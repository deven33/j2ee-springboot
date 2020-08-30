package sf.boot.sbdemo.root.dao;

import java.util.List;

import sf.boot.sbdemo.root.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
	public Employee findById(int id);
	public void save(Employee theEmp);
	public void deleteById(int id);
}
