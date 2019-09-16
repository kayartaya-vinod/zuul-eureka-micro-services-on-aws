package com.kvinod;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServiceOneMain {
	
	@GetMapping("/api/service-one")
	public Map<String, String> get() {
		Map<String, String> m = new HashMap<String, String>();
		m.put("msg", "Hello, World");
		m.put("date", new Date().toString());
		return m;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceOneMain.class, args);
	}
}
