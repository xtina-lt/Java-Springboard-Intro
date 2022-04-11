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
        @RequestParam(value="last", required=false) String last,
        @RequestParam(value="times", required=true) int times
        ){
		String full;

		
		if(first == null && last == null) {
			full = "Human";
		} else if (first != null && last != null) {
			full = String.format("%s  %s. You're Awesome!", first.toUpperCase(), last.toUpperCase());
		} else { 
            full = (first == null) ? last.toUpperCase() + ". You're Awesome." : first.toUpperCase() + ". You're Awesome";
		}
        
        if (times > 0 ) {
            String x = "<a href='/'>Go Back</a>";
            for (int i = 0; i < times ; i++) {
                x += String.format("<p><h1>Hello %s!</h1></p>", full);
            }
            return x;
        } else {
            return String.format("<p><a href='/'>Go Back</a> <h1>Hello %s!</h1></p>", full);
        }
		
    }
}

