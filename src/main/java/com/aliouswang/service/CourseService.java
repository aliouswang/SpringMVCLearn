package com.aliouswang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliouswang.dao.UserDaoImpl;
import com.aliouswang.model.Course;

@Service
public class CourseService {
	
	public Course getCourseById(int courseId) {
		Course course = new Course();
		course.setId(123);
		course.setName("Spring MVC");
		return course;
	}
	

}
