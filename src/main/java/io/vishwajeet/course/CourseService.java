package io.vishwajeet.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

	@SuppressWarnings("unchecked")
	public List<Course> getAllCourses(String topicId) {
		return (List<Course>) courseRepository.findByTopicId(topicId);
	}

	public Course getCourse(String id) {
		
		return courseRepository.findById(id).get();
	}

	public void addCourse(Course t) {
		courseRepository.save(t);
	}

	public void updateCourse(String id, Course Course) {
		courseRepository.save(Course);
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}

}