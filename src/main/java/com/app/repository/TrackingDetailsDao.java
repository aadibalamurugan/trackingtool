package com.app.repository;

import com.app.component.TrackingDetailsEntity;

public interface TrackingDetailsDao {

		public TrackingDetailsEntity getTrackingDetails(Integer id) throws Exception;	
		
}