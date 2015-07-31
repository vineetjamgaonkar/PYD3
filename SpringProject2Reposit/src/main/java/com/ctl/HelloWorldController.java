package com.ctl;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.dto.Student;
import com.service.MainApp;
import com.service.MainAppInterfate;
 
@Controller
public class HelloWorldController {
	
	@Autowired
	MainAppInterfate service;

	String message = "Welcome to Spring MVC!";
	String newMessage="What are you doing";
	
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("in controller");
		ArrayList name1=new ArrayList();
		System.out.println("Service"+service);
	    service.DeleteRecord(6);
		//Student student=new Student("Bandhu",25);
		//service.addRecord(student);
		System.out.println("OutSide Of Database Connection");
		ModelAndView mv = new ModelAndView("helloworld");
		System.out.println(name1);
		mv.addObject("message", message);
		//mv.addObject("student", student);
	//	mv.addObject("newMessage",newMessage);
		return mv;
	}
}
//com.programcreek.helloworld.databaseConnection    //HelloWorldDatabaseConnector