
package com.app.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.component.TrackingDetailsEntity;
import com.app.repository.TrackingDetailsDao;
import com.app.response.TrackingDetailsResponse;


@Service
public class TrackingDetailsServImpl implements TrackingDetailsServ{

	@Autowired
	private TrackingDetailsDao cdao;

	@Transactional
	public TrackingDetailsResponse getTrackingDetails(Integer id) {
		TrackingDetailsResponse response = new TrackingDetailsResponse();
		TrackingDetailsEntity trackentity= cdao.getTrackingDetails(id);
		response.setTid(trackentity.getTid());
		response.setTname(trackentity.getTname());
		response.setTnumber(trackentity.getTnumber());
		return response;
		
	}	
}