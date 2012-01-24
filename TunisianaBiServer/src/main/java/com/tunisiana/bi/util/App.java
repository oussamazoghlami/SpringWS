package com.tunisiana.bi.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tunisiana.bi.service.CustomerBo;


public class App {

	public static void main(String[] args) {
		// test the spring context
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext-test.xml");
		CustomerBo customerBo = (CustomerBo) appContext.getBean("customerBo");
		System.out.println(customerBo.findAllCustomer().size());
	}
}
