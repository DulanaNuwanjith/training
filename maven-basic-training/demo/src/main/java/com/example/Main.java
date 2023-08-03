package com.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(1);
        s.setName("John");
        s.setAge(20);
        s.setSubjects(Arrays.asList("Maths", "English", "History"));

        // Step 12: Print student values using getters
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Subjects: " + s.getSubjects());
    }
}