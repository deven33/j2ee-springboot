package com.sb.curd_hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sb.curd_hibernate.entity.Employee;

@Repository
public class EmployeeJPAImplDAO implements EmployeeDAO {
	
	private EntityManager entityManager;

	@Autowired
	public EmployeeJPAImplDAO(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public List<Employee> findAll() {
		// create query
		Query query = (Query) entityManager.createQuery("from Employee");
		//Execute query
		List employee = query.getResultList();
		//get result list
		return employee;
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
