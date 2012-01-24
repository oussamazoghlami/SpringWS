package com.tunisiana.bi.service;

import java.util.List;

import com.tunisiana.bi.model.Customer;

public interface CustomerBo {

	void addCustomer(Customer customer);

	List<Customer> findAllCustomer();

	Customer getCustomer(Integer customerId);

}