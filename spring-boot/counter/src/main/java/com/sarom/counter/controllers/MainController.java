package com.sarom.counter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
	
	int count = 0;

	@RequestMapping("/your_server")
	public String index(HttpSession session) {
		if (session.getAttribute("count") == null ) {
			session.setAttribute("count", 0);			
		}
		else {
			count = (Integer) session.getAttribute("count"); //anytime you are counting you must initialize a counter at 0
			count = count + 1;
			session.setAttribute("count", count);
		}
		return "index.jsp";
	}
	
	@RequestMapping("/your_server/2")
	public String index2(HttpSession session) {
		if (session.getAttribute("count") == null ) {
			session.setAttribute("count", 0);
		}
		else {
			count = (Integer) session.getAttribute("count");
			count = count + 2;
			session.setAttribute("count", count);
		}
		return "index2.jsp";
	}
	
	@RequestMapping("/your_server/reset")
	public String reset(HttpSession session) {
		session.setAttribute("count", 0);
		return "count.jsp";
	}	
	
	@RequestMapping("/your_server/counter") 
		public String counter(HttpSession session) {
		return "count.jsp";
	}
}
