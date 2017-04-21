package com.example.service;

import org.springframework.stereotype.Repository;

/**
 * Created by abhishek.
 */
@Repository("studentDAO2")
public class StudentDAOImpl2 implements StudentDAO {
    @Override
    public Student createStudent() {
        Student studentB = new Student();
        studentB.setId(222);
        studentB.setName("Abhishek");
        studentB.setGrade("A");
        return studentB;
    }
}
