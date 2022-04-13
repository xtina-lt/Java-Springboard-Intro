package com.xtinacodes.hopper.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hoppers {
	@RequestMapping("/")
	public String index(Model m) {
		m.addAttribute("name", "Grace Hopper");
		m.addAttribute("itemName", "Copper Wire");
		m.addAttribute("price", 5.25);
		m.addAttribute("description", "Metal strips, also an illustration of nanoseconds.");
		m.addAttribute("vendor", "Little Things Corner Store");
		return "index.jsp";
	}
}
