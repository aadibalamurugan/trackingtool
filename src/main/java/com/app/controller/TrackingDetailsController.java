package com.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.response.TrackingDetailsResponse;
import com.app.service.TrackingDetailsServ;


@RestController
public class TrackingDetailsController {

	@Autowired
	private TrackingDetailsServ cservice;

	// Get a Basic Tracking Details by Trackingid
	@RequestMapping(value="/getTrackingDetails/{id}", method=RequestMethod.GET, headers="Accept=application/json")
	public TrackingDetailsResponse getTrackingById(@PathVariable(name="id") int id) {
	return cservice.getTrackingDetails(id);
	
	}	
}