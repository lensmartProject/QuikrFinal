package com.capgemini.Quikr.customerservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Quikr.customerDAO.CustomerRepository;
import com.capgemini.Quikr.customermodel.CustomerModel;




@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

/*	private List<CustomerModel> customermodels=new ArrayList<>(Arrays.asList(new CustomerModel("mayuri", 5,"mayuritanpure","xyz","xyz"),
			                                          new CustomerModel("vijay",8,"kumar","abc","abc")));
 */
	/*public List<CustomerModel> getAll(){
		return customermodels;
		List<CustomerModel> customermodels=customerRepository.findAll();
}

	public void addCustomerModel(CustomerModel customerModel) {
		customermodels.add(customerModel);
		}
	*/
	public void createUser(CustomerModel customerModel) {
		customerRepository.save(customerModel);
			
		}
	
	
	public List<CustomerModel> getAllUsers() {
		
		 
		List<CustomerModel> customers = new ArrayList<>();
		customerRepository.findAll().forEach(customers::add);
 
		return customers;
	}
	
	
}
