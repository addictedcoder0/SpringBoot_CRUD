package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by abhishek.
 */
@Entity
public class Course {

    @Id
    private String id;
    private String name;
    private String description;

    @ManyToOne
    private Topic topic;

    // remember to keep default cons , else DI won't work and we will get C.E
    public Course(){

    }
    public Course(String id, String name, String description,String topicId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId,"","");
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

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
