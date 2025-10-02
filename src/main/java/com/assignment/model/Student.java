package com.assignment.model;


public class Student {

    @Id
    @GeneratedValue
    private int studentId;
    private String studentName;
    private String studentAddress;


    public Student(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + studentId +
                ", name='" + studentName + '\'' +
                ", address='" + studentAddress + '\'' +
                '}';
    }
}