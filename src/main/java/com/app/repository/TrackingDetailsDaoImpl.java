package com.app.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.component.TrackingDetailsEntity;

@Repository
public class TrackingDetailsDaoImpl implements TrackingDetailsDao {

	@Autowired
	private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	// Get country by id from the database
	public TrackingDetailsEntity getTrackingDetails(Integer id) {		
		TrackingDetailsEntity trackDetails = (TrackingDetailsEntity) getTemplate().get(TrackingDetailsEntity.class, new Integer(id));
		System.out.println(trackDetails.toString());
		return trackDetails;
	}
}