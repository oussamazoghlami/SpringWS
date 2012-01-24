package com.tunisiana.bi.endpoint;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;

import com.tunisiana.bi.jaxb.HolidayRequest;
import com.tunisiana.bi.jaxb.HolidayResponse;
import com.tunisiana.bi.service.CustomerBo;
import com.tunisiana.bi.service.HumanResourceService;
import com.tunisiana.bi.util.Constants;

/**
 * This is the endpoint that will receive every Holiday Request Query and invoke
 * the Human Resource Service to store it.
 * 
 * @author oussama.zoghlami.ext
 * 
 */
@Endpoint("holidayEndpoint")
public class HolidayEndpoint {

	@Autowired
	private HumanResourceService humanResourceService;

	@Autowired
	private CustomerBo customerBo;

	@PayloadRoot(localPart = "HolidayRequest", namespace = Constants.TUNISIANA_BI_NAMESPACE)
	public HolidayResponse handleHolidayRequest(HolidayRequest holidayRequest) {
		Date startDate = holidayRequest.getHoliday().getStartDate().toGregorianCalendar().getTime();
		Date endDate = holidayRequest.getHoliday().getEndDate().toGregorianCalendar().getTime();
		humanResourceService.bookHoliday(startDate, endDate, holidayRequest.getEmployee()
				.getFirstName());
		HolidayResponse holidayResponse = new HolidayResponse();
		holidayResponse.setMessage("Succefull Holiday Booking");
		holidayResponse.setStatus(customerBo.findAllCustomer().size() + "");
		return holidayResponse;
	}

	public HumanResourceService getHumanResourceService() {
		return humanResourceService;
	}

	public void setHumanResourceService(HumanResourceService humanResourceService) {
		this.humanResourceService = humanResourceService;
	}

	public CustomerBo getCustomerBo() {
		return customerBo;
	}

	public void setCustomerBo(CustomerBo customerBo) {
		this.customerBo = customerBo;
	}

}
