package org.gdeos.training.customerdetails.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="customertrackingdetails")
public class CustomerEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private Integer id;
	
	@Column(name="CustomerName")
	private String customerName;
	
	@Column(name="CustomerInitial")
	private String customerInitial;
	
	@Column(name="Age")
	private Integer age;
	
	@Column(name="DateOfBirth")
	 @Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	
	@Column(name="Gender")
	private String gender;

	@Column(name="Contactno")
	private String contactno;
	
	@Column(name="E-MailId")
	private String eMailId;

	  
	/*  @OneToMany(cascade=CascadeType.ALL)
	    @JoinColumn(name="FK_Customer_Id")
	    private List<AddressEntity> addressDetails;*/

	/*  @OneToMany(cascade=CascadeType.ALL)
	    @JoinColumn(name="Customer_Id_Fk")
	    private List<CustomerDepartmentDetails> customerDepartmentDetails;
	  */
	  @OneToMany(cascade=CascadeType.ALL)
	   // @JoinColumn(name="Customer_Id_Fk")
	    private List<CustomerDepartmentDetails> customerDepartmentDetails;
	  
	  
	public List<CustomerDepartmentDetails> getCustomerDepartmentDetails() {
		return customerDepartmentDetails;
	}

	public void setCustomerDepartmentDetails(List<CustomerDepartmentDetails> customerDepartmentDetails) {
		this.customerDepartmentDetails = customerDepartmentDetails;
	}

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

/*	public List<AddressEntity> getAddressDetails() {
		return addressDetails;
	}

	public void setAddressDetails(List<AddressEntity> addressDetails) {
		this.addressDetails = addressDetails;
	}
*/
	


	

	

}
