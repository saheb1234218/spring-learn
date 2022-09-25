package com.example.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

		@GetMapping("/welcomes")
		public String getres() {
			return "Hi APurba Welcome to Jenkins";
		}
		
}
