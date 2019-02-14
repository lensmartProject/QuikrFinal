package com.capgemini.Quikr.customerDAO;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.Quikr.customermodel.CustomerModel;

public interface CustomerRepository extends MongoRepository<CustomerModel, String> {

}
