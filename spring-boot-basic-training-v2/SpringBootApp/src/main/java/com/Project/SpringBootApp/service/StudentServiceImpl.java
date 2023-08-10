package com.Project.SpringBootApp.service;

import com.Project.SpringBootApp.model.Student;
import com.Project.SpringBootApp.repository.StudentRepository;
import dto.StudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class StudentServiceImpl implements StudentService {

    private static final Logger logger = LoggerFactory.getLogger(StudentService.class);

    public void doSomething() {
        logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("Warning message");
        logger.error("Error message");
    }

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(String id) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        return studentOptional.orElse(null);
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student createStudent(StudentRequest studentRequest) {
        Student student1 = new Student();
        student1.setName("ST1");
        return studentRepository.save(student1);
    }

    @Override
    public void deleteStudentById(String id) {
       if (!studentRepository.existsById(id)) {
            throw new StudentException("Student not found with ID: " + id);
        }
       studentRepository.deleteById(id);
    }
}