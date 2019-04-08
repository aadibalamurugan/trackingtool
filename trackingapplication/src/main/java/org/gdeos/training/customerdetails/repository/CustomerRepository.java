package org.gdeos.training.customerdetails.repository;

import org.gdeos.training.customerdetails.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository("customerRespository")
public interface CustomerRepository  extends JpaRepository<CustomerEntity, Integer>{

	
	//List<CustomerEntity> findByFirstNameCustomerId(Integer id);
}
