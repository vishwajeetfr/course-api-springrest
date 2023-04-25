package com.springrest.springrest.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.services.CourseService;

@RestController
public class Mycontroller { 
	@Autowired
	
	private CourseService courseService;
	
	
	@GetMapping("/home")
	public String home() 
	{
	
		return "Welcome to the courses application";
		
		
	}
	@GetMapping("/courses")
	public ArrayList<Courses> getCourses()
	{
		return (ArrayList<Courses>) this.courseService.getCourses() ;
		
	}
	@GetMapping("courses/{courseId}")
	public Courses getCourses(@PathVariable String courseId)
	{
		return this.courseService.getCourses(Long.parseUnsignedLong(courseId));
	}

}
