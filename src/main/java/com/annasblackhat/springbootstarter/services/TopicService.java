package com.annasblackhat.springbootstarter.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.annasblackhat.model.Topic;

@Service
public class TopicService {
	
	List<Topic> topics = new ArrayList<>( Arrays.asList(
			new Topic("1", "Spring", "Spring framework description"),
			new Topic("2", "Java", "Java description"),
			new Topic("3", "Spring Boot", "Spring Boot framework description"),
			new Topic("4", "Java Server Pages", "Java Server Pages description"),
			new Topic("5", "Spring Hibernate", "Spring framework and Hibernate description")
			));
	
	public List<Topic> getAllTopic(){
		return topics;
	}
	
	public Topic getTopic(String id){
		return topics.stream().filter(p -> p.getId().equals(id)).findFirst().get();
	}

	public void udpate(String id, Topic topic) {
		for(int i=0; i<topics.size(); i++){
			if(topics.get(i).getId().equals(id)){
				topics.set(i, topic);
				break;
			}
		}
	}

	public void delete(String id) {
		topics.remove(topics.stream().filter(p -> p.getId().equals(id)).findFirst().get());
	}
	
	
}
