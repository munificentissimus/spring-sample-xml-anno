package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	
	@Value("${ambiente}")
	private String ambiente;
	
	public List<Customer> findAll() {

		List<Customer> customers = new ArrayList<Customer>();

		Customer customer = new Customer();
		customer.setFirstName(ambiente);
		customer.setLastName("Carvalho");

		customers.add(customer);

		return customers;
	}
}
