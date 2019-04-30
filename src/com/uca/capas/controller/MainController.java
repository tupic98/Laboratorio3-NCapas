package com.uca.capas.controller;



import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Student;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		mav.addObject("message", "Hola buenas labo05");
		return mav;
	}
	
	@RequestMapping(value = "/formData", method = RequestMethod.POST)
	public ModelAndView formData(
			@RequestParam(value = "name") String name,
			@RequestParam(value = "lname") String lName,
			@RequestParam(value = "birthdate") String bDate,
			@RequestParam(value = "carreer") String carreer,
			@RequestParam(value = "experience") String experience) {
		
		ModelAndView mav = new ModelAndView();
		Student student = new Student();
		student.setName(name);
		student.setLastName(lName);
		student.setbDate(bDate);
		student.setCarreer(carreer);
		student.setExperience(experience);
		mav.setViewName("form");
		mav.addObject("student", student);
		return mav;
	}
	
	@RequestMapping("/formJSON")
	@ResponseBody
	public Student studentForm() {
		Student student = new Student("Rodrigo","Alvarenga", "11/01/1988", "Info", "Estudiante");
		return student;
	}
}
