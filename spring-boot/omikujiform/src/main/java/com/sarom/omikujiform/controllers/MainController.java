package com.sarom.omikujiform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {

	@RequestMapping("/omikuji")
	public String index() {
		return "index.jsp";
	}

	@RequestMapping("/omikuji/show")
		public String show() {
			return "show.jsp";
	}

	@PostMapping("/process")
		public String process(
				HttpSession session, 
				@RequestParam(value="numberInput") Integer numberInput,
				@RequestParam(value="cityInput") String cityInput,
				@RequestParam(value="personInput") String personInput,
				@RequestParam(value="hobbyInput") String hobbyInput,
				@RequestParam(value="livingInput") String livingInput,
				@RequestParam(value="niceInput") String niceInput
			) {
		session.setAttribute("numberInput", numberInput);
		session.setAttribute("cityInput", cityInput);
		session.setAttribute("personInput", personInput);
		session.setAttribute("hobbyInput", hobbyInput);
		session.setAttribute("livingInput", livingInput);
		session.setAttribute("niceInput", niceInput);
		return "redirect:/omikuji/show";
	}
}
