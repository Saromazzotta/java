package com.sarom.ninjagoldgame.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index(
			Model model,
			HttpSession session
			) {
		int gold = 0;
		model.addAttribute("gold", gold);
		return "index.jsp";
	}
}
