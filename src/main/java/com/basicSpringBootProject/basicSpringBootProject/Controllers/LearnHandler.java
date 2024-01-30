package com.basicSpringBootProject.basicSpringBootProject.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class LearnHandler {

	@RequestMapping({"/"})
	public String showData( HttpServletRequest request) {
		request.getSession().setAttribute("loginid", "gyan");
		return "helo";
		
	}
	@RequestMapping({"/checkLogin"})
	public String checkLogin() {
		//String login=(String) request.getSession().getAttribute("loginid");
		System.out.println("checkLogin method hitted");
		return "Done";
		
	}
	@RequestMapping({"/notfound"})
	public String notfound() {
		//String login=(String) request.getSession().getAttribute("loginid");
		System.out.println("notfound method hitted");
		return "notfound";
		
	}
}
