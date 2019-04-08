package org.gdeos.training.customerdetails.controller;

import org.gdeos.training.customerdetails.commonException.ResourceNotFoundException;
import org.gdeos.training.customerdetails.response.CommonMessage;
import org.gdeos.training.customerdetails.response.CustomerDetailsResponse;
import org.gdeos.training.customerdetails.service.CustomerDetailsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerDetailsController {

	private static final Logger logger = 
			LoggerFactory.getLogger(CustomerDetailsController.class);

	@Autowired
	private CustomerDetailsService cservice;
	
	
	public CustomerDetailsService getCservice() {
		return cservice;
	}


	public void setCservice(CustomerDetailsService cservice) {
		this.cservice = cservice;
	}


	@RequestMapping(value = "/getTrackingDetails/{id}", method = RequestMethod.GET, produces = "application/json")
	public CommonMessage getTrackingById(@PathVariable(value="id") int id) throws ResourceNotFoundException {
		logger.info("Example log from {}", CustomerDetailsController.class.getSimpleName());
		CommonMessage message =  new CommonMessage();
		CustomerDetailsResponse customerDetailsResponse;
		customerDetailsResponse=cservice.getCustomerDetails(id);
		message.setTracingrresponse(customerDetailsResponse);
		//if(response != null) {
		//commonMessage.
		//commonMessage.get
	//	}
		return message;
	}


}
