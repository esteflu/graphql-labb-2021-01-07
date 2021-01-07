package com.example.mutation;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Service
public class Mutation implements GraphQLMutationResolver {

  @Autowired
  private UserService userService;

  public User addUser(String name, String email) {
    return userService.addUser(name, email);
  }

  public boolean deleteUser(int id) {
    return userService.deleteUser(id);
  }

}
