package com.devops.welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("")
	public String welcome() {
		return "<h1>Hello Word!</h1>";
	}
}
