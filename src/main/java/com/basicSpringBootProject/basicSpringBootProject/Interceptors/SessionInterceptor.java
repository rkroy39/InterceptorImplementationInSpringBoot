package com.basicSpringBootProject.basicSpringBootProject.Interceptors;

import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SessionInterceptor implements HandlerInterceptor  {
	@Override
	public boolean preHandle(
	  HttpServletRequest request,
	  HttpServletResponse response, 
	  Object handler) throws Exception {
	   System.out.println("Inside SessionInterceptor"); 
	    
	    System.out.println("[SessionInterceptor][" + request + "]" + "[" + request.getMethod()
	      + "]" + request.getRequestURI());
	   String login= (String) request.getSession().getAttribute("loginid");
	   if(login!=null) {
		   System.out.println("inside true");
	    return true;}
	   else {
		   System.out.println("inside false");
		   response.sendRedirect("/notfound");
		   return false;
	   }
	}
}
