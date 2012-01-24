package com.tunisiana.bi.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.tunisiana.bi.dao.CustomerDao;
import com.tunisiana.bi.model.Customer;

@Repository("customerDao")
@SuppressWarnings("unchecked")
public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao{
	
	@Autowired
	public CustomerDaoImpl(@Qualifier("sessionFactory") SessionFactory sessionFactory) {
		this.setSessionFactory(sessionFactory);
	}
	
	public void addCustomer(Customer customer){
		customer.setCreatedDate(new Date());
		getHibernateTemplate().save(customer);
	}
	
	public List<Customer> findAllCustomer(){
		return getHibernateTemplate().find("from Customer");
	}
	
	public Customer getCustomer(Integer customerId) {
		return (Customer) getHibernateTemplate().get(Customer.class, customerId);
	}
}