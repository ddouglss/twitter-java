package com.ddouglss.springsecurity.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;

    private String name;
}
