package com.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by abhishek.
 */
@Entity
public class Topic {

    @Id
    private String id;
    private String name;
    private String description;

    // remember to keep default cons , else DI won't work and we will get C.E
    public Topic(){

    }
    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
