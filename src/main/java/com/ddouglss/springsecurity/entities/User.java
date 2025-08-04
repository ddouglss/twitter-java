package com.ddouglss.springsecurity.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;


import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "tb_users")
public class User {

    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID userId;

    private String userName;

    private String password;

    private Set<Role> roles;

}
