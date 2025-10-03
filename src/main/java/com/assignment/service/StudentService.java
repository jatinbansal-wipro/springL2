package com.assignment.service;

import com.assignment.model.Student;
import com.assignment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Transactional
    public List<Student> getAllDetails() {
        return studentRepository.findAll();
    }

    @Transactional
    public Student getDetails(int studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }
}
