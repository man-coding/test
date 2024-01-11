package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class SampleContrller {
	
	@GetMapping("/")
	public String ex1() {
		
		return "ex1";
	}
}
