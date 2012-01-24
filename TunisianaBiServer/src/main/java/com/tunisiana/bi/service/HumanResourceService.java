package com.tunisiana.bi.service;

import java.util.Date;

/**
 * 
 * @author oussama.zoghlami.ext
 * 
 */
public interface HumanResourceService {

	/**
	 * Method to save a new Holiday request
	 * 
	 * @param startDate
	 * @param endDate
	 * @param employeeName
	 */
	public void bookHoliday(Date startDate, Date endDate, String employeeName);

}
