package com.example.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by abhishek.
 */
// just by extending the CrudRepository we get access to all the basic jpa method calls
//CrudeRepository<EntityClass , PrimaryIdType>
public interface CourseRepository extends CrudRepository<Course,String> {

    /* if naming of the method is done as per the convention then spring JPA will provide
     the implementation internally.
    */
    public List<Course> findByTopicId(String topicId);
}
