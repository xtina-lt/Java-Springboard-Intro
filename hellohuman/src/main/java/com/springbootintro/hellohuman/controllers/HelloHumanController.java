package com.springbootintro.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanController {
    
    @RequestMapping("/hello")
    public String home(){
        return "HelloWorld";
    }

    @RequestMapping("")
	public String getName(
        @RequestParam(value="first", required=false) String first,
        @RequestParam(value="last", required=false) String last
        ){
		String full;
		
		if(first == null && last == null) {
			full = "Human";
		} else if (first != null && last != null) {
			full = String.format("%s  %s", first.toUpperCase(), last.toUpperCase());
		} else { 
            full = (first == null) ? last.toUpperCase() + ". You're Awesome." : first.toUpperCase() + ". You're Awesome";
		}

		return String.format("<a href='/'>Go Back</a> <h1>Hello %s!</h1>", full);
    }
}

