package com.xtinacodes.madlibs.controllers;



import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MadlibController {
	
	@RequestMapping("/")
	public String index(Model m) {
		m.addAttribute("title", "Let's play madlibs");
		return "index.jsp";
	}
	
	@RequestMapping("/process")
	public String process(
			@RequestParam Map<String,String> requests, Model model ) {
			System.out.println(requests);
			model.addAllAttributes(requests);
			model.addAttribute("title", "Easter Mix Up");
			System.out.print(model);
		return "results.jsp";
	}
	
	@RequestMapping("/story")
	public String story(Model m) {
		m.addAttribute("title", "Easter Mix Up");
		return "story.jsp";
	}
}
