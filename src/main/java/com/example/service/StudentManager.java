package com.example.service;

/**
 * Created by abhishek.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("studentManager")
public class StudentManager {

    @Autowired
    @Qualifier("studentDAO2")
    StudentDAO studentDAO;

    public Student createStudent(){
        return studentDAO.createStudent();
    }
}
