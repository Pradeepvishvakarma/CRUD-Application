package io.firstcrudproject.firstcrude.topicCrudOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicCrudeOpearationService {
	
	@Autowired
	private TopicCrudeRepository topicCrudeRepository;
	  
  		public List<TopicCrudeOpearation> getAllTopicCrudeOpearations() {
			
  			List<TopicCrudeOpearation> topicCrudeOpearations = new ArrayList<>();
  			topicCrudeRepository.findAll()
  			.forEach(topicCrudeOpearations::add);
  			return topicCrudeOpearations;
		}	
 
  		/////This method getting only one resourse at the time. 		
  		public Optional<TopicCrudeOpearation> getTopicCrudeOpearation(String id) {
  			
  			return topicCrudeRepository.findById(id);
  		}
  		
		public void addTopicCrudeOpearation(TopicCrudeOpearation topicCrudeOpearation) {
			topicCrudeRepository.save(topicCrudeOpearation);
		}
		
		public void updateTopicCrudeOpearation(String id, TopicCrudeOpearation topicCrudeOpearation) {
	
			topicCrudeRepository.save(topicCrudeOpearation);
		}

		   public void deleteTopicCrudeOpearation(String id) {
					
			   topicCrudeRepository.deleteById(id);
				}	
}