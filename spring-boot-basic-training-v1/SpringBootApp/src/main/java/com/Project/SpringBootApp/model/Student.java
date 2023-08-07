package com.Project.SpringBootApp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
public class Student {

    @Id
    private String id;
    private String name;
    private String dateOfBirth;
    private double average;

    // Constructor, getters, setters
}
