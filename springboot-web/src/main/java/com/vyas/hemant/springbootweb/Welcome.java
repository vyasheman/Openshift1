package com.vyas.hemant.springbootweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

	String hostName  = System.getenv().getOrDefault("HOSTNAME", "unknown");
	
	
	@GetMapping("/welcome")
	public String welcome() {
		System.out.println("value " +  System.getenv());
		return "Welcome to the openshift your env. is " +  hostName;
	}
	
}
