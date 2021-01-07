package com.example.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.entity.Address;
import com.example.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserResponseResolver implements GraphQLResolver<User> {

  public String getName(User user) {
    System.out.println("Getting user name");
    return user.getName();
  }

  public String getEmail(User user) {
    System.out.println("Getting user email");
    return user.getEmail();
  }

  public Address getAddress(User user) {
    if (user.getAddress() != null) {
      System.out.println("Getting address");
      return user.getAddress();
    }
    return null;
  }

}
