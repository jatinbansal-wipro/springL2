package com.assignment;
import com.assignment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {
    @Autowired
    private StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("All students:");
        studentService.getAllDetails().forEach(System.out::println);

        System.out.println("Student by Id 5:");
        System.out.println(studentService.getDetails(5));
    }

}