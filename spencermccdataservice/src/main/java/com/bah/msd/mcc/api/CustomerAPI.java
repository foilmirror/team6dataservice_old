package com.bah.msd.mcc.api;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bah.msd.mcc.domain.Customer;

@RestController
@RequestMapping("/customers")
public class CustomerAPI {
	ArrayList<Customer> customerList = new ArrayList<Customer>();

	public CustomerAPI() {
		Customer c1 = new Customer(1, "Austin", "pass", "austin@bah.com");
		
		customerList.add(c1);

	}

	@GetMapping
	public Collection<Customer> getAll() {
		return this.customerList;
	}
}
