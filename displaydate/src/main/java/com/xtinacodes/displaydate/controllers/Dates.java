package com.xtinacodes.displaydate.controllers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
		LocalDate date = LocalDate.now();
		d += date.format(DateTimeFormatter.ofPattern("EEEE,")) + " the ";
		d += date.format(DateTimeFormatter.ofPattern("d")) + " of ";
		d += date.format(DateTimeFormatter.ofPattern("MMMM, yyyy."));
		

		m.addAttribute("k", "The date to conquer life: ");
		m.addAttribute("v", d);
		return "index.jsp";

	}
	
	@RequestMapping("/time")
	public String time(Model m) {
		LocalDateTime t = LocalDateTime.now();
		
		m.addAttribute("k", "The current time to be alive is: ");
		m.addAttribute("v", t.format(DateTimeFormatter.ofPattern("HH:mm:ss.")));
		return "index.jsp";
	}
}
