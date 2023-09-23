package io.vishwajeet.course;

import org.springframework.data.repository.CrudRepository;

import antlr.collections.List;


public interface CourseRepository extends CrudRepository<Course, String>
    {
	    List findByTopicId(String id);
    }

