package com.Project.SpringBootApp.service;

import com.Project.SpringBootApp.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student getStudentById(String id);

    Student createStudent(Student student);

    void deleteStudentById(String id);
}
