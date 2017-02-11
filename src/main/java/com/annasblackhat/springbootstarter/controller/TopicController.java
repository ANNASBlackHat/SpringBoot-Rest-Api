package com.annasblackhat.springbootstarter.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.annasblackhat.model.Topic;
import com.annasblackhat.springbootstarter.services.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topic")
	public List<Topic> getAllTopics(){
		return topicService.getAllTopic();
	}
	
	@RequestMapping("/topic/{id}")
	public Topic getTopic(@PathVariable String id){
		return topicService.getTopic(id);
	}
	
	@RequestMapping(value = "/topic", method = RequestMethod.POST)
	public void addTopic(@RequestBody Topic topic){
		topicService.getAllTopic().add(topic);
	}
	
	@RequestMapping(value = "/topic/{id}", method = RequestMethod.PUT)
	public void updateTopic(@PathVariable String id, @RequestBody Topic topic){
		topicService.udpate(id, topic);
	}
	
	@RequestMapping(value = "/topic/{id}", method = RequestMethod.DELETE)
	public void deleteTopic(@PathVariable String id){
		topicService.delete(id);
	}
}
