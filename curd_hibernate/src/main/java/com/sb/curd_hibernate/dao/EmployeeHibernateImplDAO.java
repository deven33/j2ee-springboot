package com.sb.curd_hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sb.curd_hibernate.entity.Employee;

@Repository
public class EmployeeHibernateImplDAO implements EmployeeDAO{

	private EntityManager entityManager;
	
	@Autowired
	public EmployeeHibernateImplDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Employee> findAll() {		
		//get hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		//create query
		Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);
		//execute query and get result list
		List<Employee> employee = query.getResultList();
		//return result
		return employee;
	}

	@Override
	public Employee findById(int id) {
		//get session
		Session session = entityManager.unwrap(Session.class);
		//get employee
		Employee employee = session.get(Employee.class, id);		
		//return employee
		return employee;
	}

	@Override
	public void saveEmployee(Employee employee) {
		// get session 
		Session session = entityManager.unwrap(Session.class);
		//Save employee
		System.out.println("inside DAO save employee");
		session.saveOrUpdate(employee);// if primary key or Id is 0 then save/insert otherwise update
	}

	@Override
	public void deleteById(int id) {
		//get session
		Session session = entityManager.unwrap(Session.class);
		//delete primary key object
		Query query = session.createQuery("delete from Employee where id = ?1");
		query.setParameter(1, id);
		query.executeUpdate();
	}
	
	
}
