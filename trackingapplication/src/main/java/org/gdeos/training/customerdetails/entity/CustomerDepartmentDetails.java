package org.gdeos.training.customerdetails.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="customerdepartmentdetails")
public class CustomerDepartmentDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Dept_Id")
	private Integer id;
	
	@Column(name="DepartmentName")
	private String departmentName;
	

	//@OneToMany(mappedBy="department")
	 @ManyToOne
	 @JoinColumn(name="Id", nullable=false)
	private CustomerEntity customerDetails;




	public CustomerEntity getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerEntity customerDetails) {
		this.customerDetails = customerDetails;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	

	
	
	
	
	
}
