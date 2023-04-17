package com.springrest.springrest.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Courses;

@Service
public class CourseServiceImpl implements CourseService {

	
	
	
	ArrayList<Courses> list = new ArrayList<>();
	
	public CourseServiceImpl() 
	{
		list.add(new Courses (145, "Java Core Course", "this course contains basics of java"));
		list.add(new Courses (4343,"spring boot course","creating rest api using spring boot"));
	} 

	@Override
	public ArrayList<Courses> getCourses() {
		
		return list;
	}

}
