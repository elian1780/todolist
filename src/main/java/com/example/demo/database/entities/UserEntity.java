package com.example.demo.database.entities;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private String firstName;
    private String lastName;



}
