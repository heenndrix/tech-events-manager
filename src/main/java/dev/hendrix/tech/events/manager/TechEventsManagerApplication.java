package dev.hendrix.tech.events.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class TechEventsManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechEventsManagerApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "Hello World!";
	}
}
