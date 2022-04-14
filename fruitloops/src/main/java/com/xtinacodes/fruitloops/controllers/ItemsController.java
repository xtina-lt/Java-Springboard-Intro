package com.xtinacodes.fruitloops.controllers;

import java.util.*;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xtinacodes.fruitloops.models.Item;

@Controller
public class ItemsController {
	
	@RequestMapping("/")
	public String index(HttpSession s, Model m) {
//		if (s.getAttribute("count")== null) {
//			s.setAttribute("count", 0);
//		} else {
//			int current = (int) s.getAttribute("count");
//			current++;
//			s.setAttribute("count", current);
//		}
		
		Object e = s.getAttribute("count");
		int current = (e  == null) ? 0 : ((int) e + 1);
		s.setAttribute("count", current);
	

		ArrayList<Item> fruits = new ArrayList<Item>();
		fruits.add( new Item("Banana", 2.50) );
		fruits.add( new Item("Blueberries", 8.00) );
		fruits.add( new Item("Mango", 1.50) );
		
		fruits.add( new Item("Session", (double) current) );
		m.addAttribute("output", fruits);
		
		return "index.jsp";
	}
	
	@RequestMapping("/count")
	public String counter(HttpSession s, Model m) {
		Object count = s.getAttribute("count");
		System.out.println(count);
		int current = (count  == null) ? 0 : ((int) count + 1);
		
		s.setAttribute("count", current);
		m.addAttribute("current", current);

		return "counter.jsp";
	}
}
