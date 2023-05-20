package com.sarom.loginandreg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class LoginandregApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginandregApplication.class, args);
	}
	
	@GetMapping("/")
	public String rootRouteRedirect() {
		return "redirect:/users";
	}

}
