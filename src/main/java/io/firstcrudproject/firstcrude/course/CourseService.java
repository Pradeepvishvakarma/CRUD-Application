package io.firstcrudproject.firstcrude.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	  
  		public List<Course> getAllCourses(String topicCrudeOpearationId) {
			
  			List<Course> courses = new ArrayList<>();
  			courseRepository.findByTopicCrudeOpearationId(topicCrudeOpearationId)
  			.forEach(courses::add);
  			return courses;
		}	
 
  		/////This method getting only one resourse at the time. 		
  		public Optional<Course> getCourse(String id) {
  			
  			return courseRepository.findById(id);
  		}
  		
		public void addCourse(Course course) {
			courseRepository.save(course);
		}
		
		public void updateCourse( Course course) {
	
			courseRepository.save(course);
		}

		   public void deleteCourse(String id) {
					
			   courseRepository.deleteById(id);
				}	
}