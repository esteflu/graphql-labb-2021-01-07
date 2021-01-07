package com.example.util;

import com.example.entity.Address;
import com.example.entity.User;

public class EntityProducer {

  private User user;

  public static User createUser(String name, String email) {
    User user = new User();
    user.setName(name);
    user.setEmail(email);
    return user;
  }

}
