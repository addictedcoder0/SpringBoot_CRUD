package com.example.controller.topic;

import com.example.model.Topic;
import com.example.service.topic.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by abhishek.
 */
@RestController
public class TopicController {

    @Autowired
    TopicService topicService;

    @RequestMapping("/topic")
    public List<Topic> getTopic(){
        return topicService.getTopics();
    }

    @RequestMapping("/topic/{id}")
    public Topic getTopic(@PathVariable("id") String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(value="/topic",method = RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(value="/topic/{id}",method= RequestMethod.PUT)
    public void updateTopic(@PathVariable("id") String id,
                            @RequestBody Topic topic){
        topicService.updateTopic(id, topic);
    }

    @RequestMapping(value="/topic/{id}",method = RequestMethod.DELETE)
    public void deleteTopic(@PathVariable("id") String id){
        topicService.deleteTopic(id);
    }


}
