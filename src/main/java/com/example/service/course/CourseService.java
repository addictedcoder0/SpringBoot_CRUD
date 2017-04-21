package com.example.service.course;

import com.example.model.Course;
import com.example.model.CourseRepository;
import com.example.model.Topic;
import com.example.model.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by abhishek.
 */
@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    //Arrays.asList() is immutable in its nature , so wrap it with ArrayList for making it mutable
    List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("111", "spring", "its beautiful"),
            new Topic("222", "springboot", "its awesome"),
            new Topic("333", "Rust", "its future")));

    public List<Course> getCourses(String topicId) {

        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach (courses::add);
        return courses;
    }

    public Course getCourse(String id){
        return courseRepository.findOne(id);
    }

    public void addCourse(Course course){
        courseRepository.save(course);
    }

    public void updateCourse(Course updatedCourse){
// repo is smart : it check , if @Id already exist or not if exists then update it else save it
        courseRepository.save(updatedCourse);
    }

    public void deleteCourse(String id){
        courseRepository.delete(id);
    }
}
