package com.xtinacodes.displaydate.controllers;

import java.text.SimpleDateFormat;
import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Dates {
	
	@RequestMapping("/")
	public String index(Model m) {
		m.addAttribute("k", "Lets play with Java Dates!");
		return "index.jsp";
	}
	
	@RequestMapping("/today")
	public String today(Model m) {
		String d = "";
		Date date = new Date();
		d += new SimpleDateFormat("EEEE,").format(date) + " the ";
		d += new SimpleDateFormat("d").format(date) + " of ";
		d += new SimpleDateFormat("MMMM, yyyy.").format(date);
		

		m.addAttribute("k", "The date to conquer life: ");
		m.addAttribute("v", d);
		
		return "index.jsp";

	}
	
	@RequestMapping("/time")
	public String time(Model m) {
		Date date = new Date();
		
		m.addAttribute("k", "The current time to be alive is: ");
		m.addAttribute("v", new SimpleDateFormat("HH:mm:ss.").format(date));
		
		return "index.jsp";
	}
}
