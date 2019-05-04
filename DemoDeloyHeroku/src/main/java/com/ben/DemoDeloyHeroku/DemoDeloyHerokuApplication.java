package com.ben.DemoDeloyHeroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoDeloyHerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDeloyHerokuApplication.class, args);
	}

}

@RestController
class DemoController{

	@GetMapping("/v1")
	String demo(){
		return "trung day";
	}
}


