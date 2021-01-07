package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.util.EntityProducer;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;


  public List<User> getAllUsers() {
    List<User> allUsers = new ArrayList<>();
    userRepository.findAll().forEach(allUsers::add);
    return allUsers;
  }

  public User addUser(String name, String email) {
    return userRepository.save(EntityProducer.createUser(name, email));
  }

  public boolean deleteUser(int id) {
    userRepository.deleteById(id);
    return true;
  }

}
