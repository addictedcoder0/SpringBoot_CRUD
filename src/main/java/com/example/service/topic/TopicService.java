package com.example.service.topic;

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
public class TopicService {

    @Autowired
    TopicRepository topicRepository;

    //Arrays.asList() is immutable in its nature , so wrap it with ArrayList for making it mutable
    List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("111", "spring", "its beautiful"),
            new Topic("222", "springboot", "its awesome"),
            new Topic("333", "Rust", "its future")));

    public List<Topic> getTopics() {
    List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach (topics::add);
        return topics;
    }

    public Topic getTopic(String id){
        return topicRepository.findOne(id);
    }

    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }

    public void updateTopic(String id,Topic updatedtopic){
// repo is smart : it check , if @Id already exist or not if exists then update it else save it
        topicRepository.save(updatedtopic);
    }


    public void deleteTopic(String id){
        topicRepository.delete(id);
    }
}
