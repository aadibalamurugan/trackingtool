package org.gdeos.training.customerdetails.service;

import org.gdeos.training.customerdetails.commonException.ResourceNotFoundException;
import org.gdeos.training.customerdetails.entity.CustomerEntity;
import org.gdeos.training.customerdetails.repository.CustomerRepository;
import org.gdeos.training.customerdetails.response.CustomerDetailsResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("cservice")
public class CustomerDetailsServiceImpl  implements CustomerDetailsService{

	
	/*@Autowired
	CustomerDetailsDao cdao;
	*/
	@Autowired
	CustomerRepository customerRespository;
	
	/*@Autowired
    private CustomerRepository customerRepository;*/
	
	private static final Logger logger = 
			LoggerFactory.getLogger(CustomerDetailsServiceImpl.class);
	
	@Transactional
	public CustomerDetailsResponse getCustomerDetails(int id)  throws ResourceNotFoundException{
		CustomerDetailsResponse response = new CustomerDetailsResponse();
		CustomerEntity	customerentity =  customerRespository.getOne(id);
		//CustomerEntity customerentity =  (CustomerEntity) customerRespository.findByFirstNameCustomerId(id);
		//CustomerEntity customerentity= cdao.getCustomerDetails(id);
		logger.info("CustomerEntity of serviceAPI", customerentity.toString());
  try {
		if(customerentity != null) {
			response.setId(customerentity.getId());
			response.setAge(customerentity.getAge());
			response.setCustomerName(customerentity.getCustomerName());
			response.setCustomerInitial(customerentity.getCustomerInitial());
			response.setDateOfBirth(customerentity.getDateOfBirth());
			response.setGender(customerentity.getGender());
			response.setContactno(customerentity.getContactno());
			response.seteMailId(customerentity.geteMailId());
		}
  }
	catch(Exception e){
		new ResourceNotFoundException(id);
		logger.info("Exception occur in service :" +e);
	}
		return response;
	}

}
