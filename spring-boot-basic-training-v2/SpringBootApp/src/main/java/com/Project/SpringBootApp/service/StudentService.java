package com.Project.SpringBootApp.service;

import com.Project.SpringBootApp.model.Student;
import dto.StudentRequest;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student getStudentById(String id);

    Student createStudent(Student student);

    Student createStudent(StudentRequest studentRequest);

    void deleteStudentById(String id);
}
