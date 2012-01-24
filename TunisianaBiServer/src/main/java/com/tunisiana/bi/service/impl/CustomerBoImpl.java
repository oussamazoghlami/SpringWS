package com.tunisiana.bi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunisiana.bi.dao.CustomerDao;
import com.tunisiana.bi.model.Customer;
import com.tunisiana.bi.service.CustomerBo;

@Service("customerBo")
public class CustomerBoImpl implements CustomerBo {

	@Autowired
	CustomerDao customerDao;

	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);

	}

	public List<Customer> findAllCustomer() {
		return customerDao.findAllCustomer();
	}

	public Customer getCustomer(Integer customerId) {
		return customerDao.getCustomer(customerId);
	}

}