package com.example.model;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by abhishek.
 */
// just by extending the crudrepo we get access to all the basic jpa method calls
    //CrudeRepository<EntityClass , PrimaryIdType>
public interface TopicRepository extends CrudRepository<Topic,String> {
}
