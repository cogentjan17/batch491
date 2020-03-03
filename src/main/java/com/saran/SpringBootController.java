package com.saran;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {
	
	@GetMapping("/")
	public String display() {
		return "Welcome to SpringBootAWS TEST";
	}
	
	

}
