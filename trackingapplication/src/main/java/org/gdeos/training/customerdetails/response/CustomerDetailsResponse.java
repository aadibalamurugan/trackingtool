package org.gdeos.training.customerdetails.response;

import java.io.Serializable;
import java.util.Date;



public class CustomerDetailsResponse  implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String customerName;
	private String customerInitial;
	private Integer age;
	private Date dateOfBirth;
	private String gender;
	private String contactno;
	private String eMailId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerInitial() {
		return customerInitial;
	}
	public void setCustomerInitial(String customerInitial) {
		this.customerInitial = customerInitial;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String geteMailId() {
		return eMailId;
	}
	public void seteMailId(String eMailId) {
		this.eMailId = eMailId;
	}
	
	
	
	

}
