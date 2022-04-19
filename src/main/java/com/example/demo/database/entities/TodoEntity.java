package com.example.demo.database.entities;

import com.example.demo.database.enums.TodoStatus;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "TodoList")
public class TodoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long todoId;

    @Enumerated(EnumType.STRING)
    private TodoStatus status;
    private String description;

    private Date createdDate;
    private Date dueDate;


}
