package io.firstcrudproject.firstcrude.course;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.firstcrudproject.firstcrude.topicCrudOperation.TopicCrudeOpearation;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topicsCrud/{id}/courses")	
	public List<Course> getAllCourses(@PathVariable String id) {
		return courseService.getAllCourses(id);
	}
	
	@RequestMapping("/topicsCrud/{topicCrudeOpearationId}/courses/{id}")
	public Optional<Course> getCourse(@PathVariable String id) {
		return courseService.getCourse(id);	
	}
	
	@RequestMapping(method = RequestMethod.POST , value = "/topicsCrud/{topicCrudeOpearationId}/courses")
	public void  addCourse(@RequestBody Course course , @PathVariable String topicCrudeOpearationId){
		course.setTopicCrudeOpearation(new TopicCrudeOpearation(topicCrudeOpearationId,"",""));
		courseService.addCourse(course);  
	}
	
	@RequestMapping(method = RequestMethod.PUT , value = "/topicsCrud/{topicCrudeOpearationId}/courses/{id}")
	public void  updateCourse(@RequestBody Course course , @PathVariable String topicCrudeOpearationId ,@PathVariable String id){
		course.setTopicCrudeOpearation(new TopicCrudeOpearation(topicCrudeOpearationId,"",""));
		courseService.updateCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.DELETE , value = "/topicsCrud/{topicCrudeOpearationId}/courses/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);	
	}
}