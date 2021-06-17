package com.example.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigClientApplication {
	
	
	@Autowired
	static
	abc configProps;
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
		
		System.out.println( "name is = "+configProps.getName()+"  "  + "age is = " +configProps.getAge() +"  " +"address is = "+  configProps.getAddress());
		
	}

	
	
	
	
	
}
