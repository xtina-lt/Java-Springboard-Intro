package com.xtinacodes.fruitloops.controllers;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xtinacodes.fruitloops.models.Item;

@Controller
public class ItemsController {
	
	@RequestMapping("/")
	public String index(Model m) {
		ArrayList<Item> fruits = new ArrayList<Item>();
		fruits.add(new Item("Banana", 2.50));
		fruits.add(new Item("Blueberries", 8.00));
		fruits.add(new Item("Mango", 1.50));
		
		m.addAttribute("output", fruits);
		return "index.jsp";
	}
}
