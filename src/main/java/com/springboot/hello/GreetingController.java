package com.springboot.hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@RequestMapping("/greeting")
	public static List<Greetings> greet() {
		
		Greetings kpc = new Greetings(3, "xyz");
		Greetings  kpc1 = new Greetings(4, "asd");
		
		List<Greetings> gretlist = new ArrayList<Greetings>();
		gretlist.add(kpc);
		gretlist.add(kpc1);
		return gretlist;
	}

}
