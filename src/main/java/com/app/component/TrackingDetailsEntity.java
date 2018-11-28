package com.app.component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="tracking_details")
@Component
public class TrackingDetailsEntity {

	@Id	
	@Column(name="Tracking_Id")
	private int tid;

	@Column(name="Tracking_Name")
	private String tname;

	@Column(name="Tracking_Number")
	private long tnumber;

	public TrackingDetailsEntity() { }

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public long getTnumber() {
		return tnumber;
	}

	public void setTnumber(long tnumber) {
		this.tnumber = tnumber;
	}

	@Override
	public String toString() {
		return "TrackingDetailsEntity [tid=" + tid + ", tname=" + tname + ", tnumber=" + tnumber + "]";
	}

	

}