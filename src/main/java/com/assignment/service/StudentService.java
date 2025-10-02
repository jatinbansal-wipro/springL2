package com.assignment.service;

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
