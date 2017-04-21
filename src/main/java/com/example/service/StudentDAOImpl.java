package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * Created by abhishek.
 */
@Repository("studentDAO")
public class StudentDAOImpl implements StudentDAO {

    @Override
    public Student createStudent() {
        Student studentA = new Student();
        studentA.setId(111);
        studentA.setName("Rudra");
        studentA.setGrade("I");

        return studentA;
    }


}
