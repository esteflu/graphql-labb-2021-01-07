package com.example.service;

import com.example.entity.Address;
import com.example.entity.User;
import com.example.repository.AddressRepository;
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

  @Autowired
  private AddressRepository addressRepository;


  public List<User> getAllUsers() {
    List<User> allUsers = new ArrayList<>();
    userRepository.findAll().forEach(allUsers::add);
    return allUsers;
  }

  public User addUser(String name, String email, Address address) {
    User user = EntityProducer.createUser(name, email);
    addressRepository.save(address);
    user.setAddress(address);
    return userRepository.save(user);
  }

  public boolean deleteUser(int id) {
    userRepository.deleteById(id);
    return true;
  }

  public User getUserById(int id) {
    return userRepository.findById(id).orElse(null);
  }
}
