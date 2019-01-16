package com.capgemini.Quikr.customercontroller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Quikr.customermodel.CustomerModel;
import com.capgemini.Quikr.customerservice.CustomerService;



@RestController
@RequestMapping("/CustomerModel")
public class CustomerController {

	@Autowired
	private CustomerService customerservice;
	
	/*
	@RequestMapping(method=RequestMethod.POST,value="/CustomerModel")
	public void addCustomerModel(@RequestBody CustomerModel customerModel) {
		customerservice.addCustomerModel(customerModel);
	}
	@RequestMapping("/CustomerModel")
	public List<CustomerModel> getAll(){
		return customerservice.getAll();
	}*/
	
	@PostMapping("/users/create")
	public void createUser(@RequestBody CustomerModel customerModel) {
		customerservice.createUser(customerModel);	
	}
	
	@GetMapping("/users")
	public List<CustomerModel> getAllUsers() {
		System.out.println("Get all Users...");
		
		return customerservice.getAllUsers();
	}
	
	
}
