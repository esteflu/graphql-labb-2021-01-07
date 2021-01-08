package com.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Integer id;
  private String name;
  private String email;

  @OneToOne(cascade = CascadeType.REMOVE)
  @JoinColumn(name = "address_id")
  private Address address;
}
