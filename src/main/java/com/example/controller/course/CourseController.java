package com.example.controller.course;

import com.example.model.Course;
import com.example.model.Topic;
import com.example.service.course.CourseService;
import com.example.service.topic.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by abhishek.
 */
@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @RequestMapping("/topic/{topicId}/courses")
    public List<Course> getCourses(@PathVariable("topicId") String topicId){
        return courseService.getCourses(topicId);
    }

    @RequestMapping("/topic/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable("id") String id){
        return courseService.getCourse(id);
    }

    @RequestMapping(value="/topic/{topicId}/courses",method = RequestMethod.POST)
    public void addCourse(@RequestBody Course course,@PathVariable("topicId") String topicId){
        course.setTopic(new Topic(topicId,"",""));
        courseService.addCourse(course);
    }

    @RequestMapping(value="/topic/{topicId}/courses/{id}",method= RequestMethod.PUT)
    public void updateCourse(@PathVariable("id") String id,
                             @PathVariable("topicId") String topicId,
                            @RequestBody Course course){
        course.setTopic(new Topic(topicId,"",""));
        courseService.updateCourse(course);
    }

    @RequestMapping(value="/topic/{topicId}/courses/{id}",method = RequestMethod.DELETE)
    public void deleteCourse(@PathVariable("id") String id){
        courseService.deleteCourse(id);
    }


}
