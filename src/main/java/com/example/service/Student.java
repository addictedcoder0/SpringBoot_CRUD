package com.example.service;

/**
 * Created by abhishek.
 */
public class Student {
    private int id;
    private String name;
    private String grade;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        StringBuffer details = new StringBuffer();
        details.append("id : "+this.getId());
        details.append("name : "+this.getName());
        details.append("grade : "+this.getGrade());
        return details.toString();
    }
}
