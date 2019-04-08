package org.gdeos.training.customerdetails.service;

import org.gdeos.training.customerdetails.commonException.ResourceNotFoundException;
import org.gdeos.training.customerdetails.response.CustomerDetailsResponse;

public interface CustomerDetailsService {

	public CustomerDetailsResponse getCustomerDetails(int id) throws ResourceNotFoundException ; 
}
