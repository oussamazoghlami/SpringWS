package com.tunisiana.bi.service.impl;

import java.util.Date;

import org.springframework.stereotype.Repository;

import com.tunisiana.bi.service.HumanResourceService;

/**
 * 
 * @author oussama.zoghlami.ext
 * 
 */
@Repository("humanResourceService")
public class HumanResourceServiceImpl implements HumanResourceService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tunisiana.tests.service.HumanResourceService
	 *      #bookHoliday(java.util.Date, java.util.Date, java.lang.String)
	 */
	public void bookHoliday(Date startDate, Date endDate, String employeeName) {
		System.out.println("Receiving a new Holiday request from "
				+ employeeName + "[" + startDate.toString() + ","
				+ endDate.toString() + "]");

	}
}
