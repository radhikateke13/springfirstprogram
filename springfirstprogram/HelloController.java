package com.springdemo.springfirstprogram;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody
public class HelloController {
	@RequestMapping("/")

	public String helloWorld() {

		return ("Spring First Program");
	}

	@GetMapping("/Hello")

	public String helloWorld1() {

		return ("This is Get Method");
	}
	
	}



