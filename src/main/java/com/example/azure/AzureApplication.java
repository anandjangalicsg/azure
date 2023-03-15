package com.example.azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
            return application.sources(AzureApplication.class); // Replace DemoApplication with your main class
    }

	public static void main(String[] args) {
		SpringApplication.run(AzureApplication.class, args);
	}
	
	@GetMapping("/health")
	public String health() {
		return "Succes";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

}
