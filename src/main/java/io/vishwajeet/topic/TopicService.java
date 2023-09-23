package io.vishwajeet.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.data.repository.CrudRepository; // Example import for a repository


@Service
public class TopicService 
{
	@Autowired
	private TopicRepository topicRepository;
	
	
      List<Topic> topics = new ArrayList<>(
      Arrays.asList(new Topic("SpringID","Spring framework","Spring Framework Description"),
			   new Topic("JavaID","Java Explained","Java Description"),
			   new Topic("PythonID","The Python","Python Desciption")
			   )); 
	
	
	 List<Topic> getAllTopics() 
	  {
		 //return topics;
		 List<Topic> topics = new ArrayList<>();
		 topicRepository.findAll()
		 .forEach(topics::add);
		 return topics;
	  }
	
	 Topic getTopic(String id)
		{
			//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		 
		   return topicRepository.findById(id).get();
		    
		 
		}

	public void addTopic(Topic topic)
	{
		//topics.add(topic);
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) 
	{
		
		
		
		
//		for(int i = 0; i<topics.size(); i++)
//		{
//			Topic t = topics.get(i);
//			if(t.getId().equals(id))
//			{
//				topics.set(i, topic);
//				return;
//			}
//		}
		
		topicRepository.save(topic);
		
	}
	public void deleteTopic(String id) 
	{
//		for(int i = 0 ; i<topics.size() ; i++)
//		{
//			Topic t = topics.get(i);
//			if(t.getId().equals(id))
//			{
//				topics.remove(i);
//				return;
//			}
//		}
		
		topicRepository.deleteById(id);
		
	}
	
}