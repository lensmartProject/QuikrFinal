package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.LoginUser;
import com.example.demo.model.User;


@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	

	public User addUser(User user) {
		return repository.save(user);
	}

	public List<User> getUsers() {
		List<User> users = repository.findAll();
		System.out.println("Getting data from DB : " + users);
		return users;
	}

	

	public void deleteUser(User user) {
		repository.delete(user);
	}

	public String validateUser(LoginUser loginUser) {
		// TODO Auto-generated method stub
		System.out.println(loginUser);
		List<User> users=repository.findAll();
		for (User user : users) {
			if(user.getName().equals(loginUser.getName())&&user.getPassword().equals(loginUser.getPassword())) {
				return "success";
			}
		}
		return "failed";
		
	}
}