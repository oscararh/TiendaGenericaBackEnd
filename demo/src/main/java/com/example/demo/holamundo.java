package com.example.demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class holamundo {
	
	@RequestMapping("/")
	public String hola() {
		return "hola mundo hola mundo";
		
		
	}

}
