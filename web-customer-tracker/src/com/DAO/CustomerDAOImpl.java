package com.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.Entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	//need to inject  session factory.
	@Autowired
	private SessionFactory sessionFactory;
			
	@Override
	//@Transactional
	public List<Customer> getCustomers() {
		
		
			//get a session object
		Session currentSession = sessionFactory.getCurrentSession();
			
			//create query
			Query<Customer> theQuery = currentSession.createQuery("from Customer", Customer.class);
			
			//Execute the query and get the result
			List<Customer> customer = theQuery.getResultList();
			
			//return the results
			return customer;
			
		
		}
}
