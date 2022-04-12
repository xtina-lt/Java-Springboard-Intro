package com.xtinacodes.seer.controllers;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Seers {
    @RequestMapping("/")
    public String index(Model e) {
        e.addAttribute("greet", "Welcome!");
        return "index.jsp";
    }

    @RequestMapping("/seer/today")
    public String today(Model e) {
        e.addAttribute("greet", "Today you will find luck in all your endeavors!");
        return "index.jsp";
    }

    @RequestMapping("/seer/tomorrow")
    public String tomorrow(Model e) {
        e.addAttribute("greet", "Tomorrow, an opportunity will arise, so be sure to open to new ideas!");
        return "index.jsp";
    }

    @RequestMapping("/seer/request/")
    // url: /rparam/?q=foo
    public String index(@RequestParam(value = "q", required = false) String searchQuery, Model m) {
        m.addAttribute("greet", "You searched for: " + searchQuery);
        return "index.jsp";
    }

    @RequestMapping("/seer/travel/{e}")
    public String travel(@PathVariable("e") String e, Model m) {
        m.addAttribute("greet", String.format("<h1>Congratulations you will travel to %s</h1>", e.toUpperCase()));
        return "index.jsp";
    }

    @RequestMapping("/seer/lotto/{e}")
    public String lotto(@PathVariable("e") int e, Model m) {
        String result = (e % 2 == 0)
                ? "You will take a grand journey in the near future, but be weary of tempting offers.."
                : "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends...";
        m.addAttribute("greet", "<h1>" + result + "</h1>");
        return "index.jsp";
    }

    @RequestMapping("/seer/luck")
    public String test(Model model) {
        ArrayList<String> greet = new ArrayList<String>();
        greet.add("Typed like any other fortune cookie..");
        greet.add("You will soon be fortunate.");
        greet.add("Error 404: Fortune not found.");
        greet.add("A lengthy joruney down an internet rabbit hole begins with a single click");
        greet.add("A system reboot is in your future..");
        greet.add("Java's hide and seek champion since 1995 \";\"!");
        model.addAttribute("greet", greet.get((int) (Math.random() * 6)));
        return "index.jsp";
    }

}
