package io.firstcrudproject.firstcrude.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Retry.Topic;

import io.firstcrudproject.firstcrude.topicCrudOperation.TopicCrudeOpearation;

@Entity
public class Course{

		@Id 	
		private String id;
		private String name;
		private String Description;
		
		@ManyToOne
		private TopicCrudeOpearation topicCrudeOpearation; 
		
		public Course() {

		}
		public Course(String id, String name, String description, String topicCrudeOpearationId) {
			super();
			this.id = id;
			this.name = name;
			this.Description = description; 
			this.topicCrudeOpearation = new TopicCrudeOpearation(topicCrudeOpearationId, "", "");
		}
		
		public String getId() {
			return id;
		} 
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return Description;
		}
		public void setDescription(String description) {
			Description = description;
		}
		
		public TopicCrudeOpearation getTopicCrudeOpearation() {
			return topicCrudeOpearation;
		}
		public void setTopicCrudeOpearation(TopicCrudeOpearation topicCrudeOpearation) {
			this.topicCrudeOpearation = topicCrudeOpearation;
		}
}