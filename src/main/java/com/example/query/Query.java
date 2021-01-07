package com.example.query;

import com.example.entity.User;
import com.example.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver {

	@Autowired
	private UserService userService;

	public List<User> allUsers() {
		return userService.getAllUsers();
	}

	public User userById(int id) {
		return userService.getUserById(id);
	}
}
