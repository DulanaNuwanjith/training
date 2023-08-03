package com.example;
import java.util.List;
import lombok.Data;

@Data
public class Student {
    private int id;
    private String name;
    private int age;
    private List<String> subjects;
}