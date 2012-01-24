package com.tunisiana.bi.dao;

import java.util.List;

import com.tunisiana.bi.model.Customer;
 
public interface CustomerDao{
 
	void addCustomer(Customer customer);
	
	List<Customer> findAllCustomer();
	
	Customer getCustomer(Integer customerId);
 
}