package com.assignment;

import com.assignment.config.AppConfig;
import com.assignment.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentService service = ctx.getBean(StudentService.class);
        service.getAllDetails().forEach(System.out::println);
    }
}
