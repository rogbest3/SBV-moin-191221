package com.moneyhub.web.cus;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.moneyhub.web.person.Person;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{
	public Customer findByCemailAndCpwd(String cemail, String cpwd);
	public Customer findByCemail(String cemail);
	
	
}
