package io.firstcrudproject.firstcrude.topicCrudOperation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicCrudeOpearationController {
	
	@Autowired
	private TopicCrudeOpearationService topicCrudeOpearationService;
	
	@RequestMapping("/topicsCrud")
	public List<TopicCrudeOpearation> getAllTopicCrudeOpearation() {
		return topicCrudeOpearationService.getAllTopicCrudeOpearations();	
	}
	
	@RequestMapping("/topicsCrud/{id}")
	public Optional<TopicCrudeOpearation> getTopicCrudeOpearation(@PathVariable String id) {
		return topicCrudeOpearationService.getTopicCrudeOpearation(id);	
	}
	
	@RequestMapping(method = RequestMethod.POST , value = "/topicsCrud")
	public void  addTopicCrudeOpearation(@RequestBody TopicCrudeOpearation topicCrudeOpearation){
		topicCrudeOpearationService.addTopicCrudeOpearation(topicCrudeOpearation);
	}
	
	@RequestMapping(method = RequestMethod.PUT , value = "/topicsCrud/{id}")
	public void  updateTopic(@RequestBody TopicCrudeOpearation topic , @PathVariable String id){
		topicCrudeOpearationService.updateTopicCrudeOpearation(id , topic);
	}
	
	@RequestMapping(method = RequestMethod.DELETE , value = "/topicsCrud/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicCrudeOpearationService.deleteTopicCrudeOpearation(id);	
	}
}