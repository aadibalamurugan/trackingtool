
package com.app.service;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.component.TrackingDetailsEntity;
import com.app.repository.TrackingDetailsDao;
import com.app.response.TrackingDetailsResponse;


@Service
public class TrackingDetailsServImpl implements TrackingDetailsServ{
	private static final Logger logger = Logger.getLogger(TrackingDetailsServImpl.class);
	@Autowired
	private TrackingDetailsDao cdao;
	
	public void setCdao(TrackingDetailsDao cdao) {
		this.cdao = cdao;
	}

	@Transactional
	public TrackingDetailsResponse getTrackingDetails(Integer id) throws Exception {
		TrackingDetailsResponse response = new TrackingDetailsResponse();
		TrackingDetailsEntity trackentity= cdao.getTrackingDetails(id);
		logger.info("Data Presistance" + trackentity.toString());
		if(trackentity.getTid() != null) {
			response.setTid(trackentity.getTid());
			response.setTname(trackentity.getTname());
			response.setTnumber(trackentity.getTnumber());
		}
		return response;
	}	
}