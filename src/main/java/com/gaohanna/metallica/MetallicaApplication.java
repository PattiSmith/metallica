package com.gaohanna.metallica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MetallicaApplication {

	@RequestMapping("/")
	@ResponseBody
	public String home(){
		return "Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(MetallicaApplication.class, args);
	}
}
