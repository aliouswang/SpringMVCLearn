package com.aliouswang.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aliouswang.model.Course;
import com.aliouswang.service.CourseService;

@Controller
//@RequestMapping("/course")
public class CourseController {
	
	private static Logger log = Logger.getLogger(CourseController.class.getName());
	
	@Resource
	private CourseService courseService;
	
//	@RequestMapping(value = "/course", method = RequestMethod.GET)
//	public ResponseEntity<Course>  getCourseInJson() {
//		System.out.println("Invoke get course in json!");
//		Course course = courseService.getCourseById(1);
//		if (course != null) {
//			log.error(course.getName() + course.getId());
//		}
//		
//		return new ResponseEntity<Course>(course, HttpStatus.OK);
//	}
	
	@RequestMapping(value = "/course2", method = RequestMethod.GET)
	public @ResponseBody Course  getCourseInJson(HttpServletResponse response) {
		System.out.println("Invoke get course in json!");
		Course course = courseService.getCourseById(1);
		if (course != null) {
			log.error(course.getName() + course.getId());
		}
		return course;
	}

}
