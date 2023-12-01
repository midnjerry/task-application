package com.taskboard.taskboard.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
//Lombok is a code generator
@Getter
@Setter
public class TaskItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    private boolean isDone;
    private LocalDate dueDate;
    private String category;

   // @Data provides the following:
    // getters    (if you just want getters - @Getter)
    // setters    (if you just want setter - @Setter)
    // equals / hashcode (comparison by value)
    // toString()


}
