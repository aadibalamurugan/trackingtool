package com.app.controller;



import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.response.CommonMessage;
import com.app.response.TrackingDetailsResponse;
import com.app.service.TrackingDetailsServ;


@RestController
public class TrackingDetailsController {

	private static final Logger logger = Logger.getLogger(TrackingDetailsController.class);
	
	@Autowired
	private TrackingDetailsServ cservice;
	
	public void setCservice(TrackingDetailsServ cservice) {
		this.cservice = cservice;
	}
	
	// Get a Basic Tracking Details by Trackingid
	@RequestMapping(value="/getTrackingDetails/{id}", method=RequestMethod.GET, produces = "application/json")
	public CommonMessage getTrackingById(@PathVariable(name="id") Integer id) {
		CommonMessage commonMessage= new CommonMessage();
		TrackingDetailsResponse response;
		try {
			response= cservice.getTrackingDetails(id);
			if(response != null) {
			commonMessage.setCode("001");
			commonMessage.setMessage("Successfully Data Fetched");
			commonMessage.setTracingrresponse(response);
			}
			else
			{
				commonMessage.setCode("003");
				commonMessage.setMessage("No Data Available");
			}
		}
		catch(Exception e)
		{
			response = new TrackingDetailsResponse();
			commonMessage.setCode("002");
			commonMessage.setMessage("Error Try Later");
			commonMessage.setTracingrresponse(response);
			logger.info("Please Try Some time Later ....");
		}
		return commonMessage;

	
	}	
}