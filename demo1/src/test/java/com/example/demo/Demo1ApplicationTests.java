package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;
import com.example.demo.service.UserService;



@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo1ApplicationTests {

	/*@Autowired
	private UserService service;
*/
	/*@MockBean
	private UserRepository repository;*/

	/*@Test
	public void getUsersTest() {
		when(repository.findAll()).thenReturn(Stream
				.of(new User(376, "PRABHAT", 31), new User(958, "Virat", 35)).collect(Collectors.toList()));
		assertEquals(2, service.getUsers().size());
	}
*/
/*
	@Test
	public void saveUserTest() {
		User user = new User(999, "RAHUL", 33);
		when(repository.save(user)).thenReturn(user);
		assertEquals(user, service.addUser(user));
	}

	@Test
	public void deleteUserTest() {
		User user = new User(999, "RAHUL", 33);
		service.deleteUser(user);
		verify(repository, times(1)).delete(user);
	}*/

}
