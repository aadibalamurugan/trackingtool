package com.app.service;

import com.app.response.TrackingDetailsResponse;

public interface TrackingDetailsServ {

	public TrackingDetailsResponse getTrackingDetails(Integer id) throws Exception; 
}