package com.springintro.seer.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeerController {
    
    @RequestMapping("/seer")
    public String daiki(){
        return "Welcome";
    }

    @RequestMapping("/seer/today")
    public String today(){
        return "Today you will find luck in all your endeavors!";
    }

    @RequestMapping("/seer/tomorrow")
    public String tomorrow(){
        return "Tomorrow, an opportunity will arise, so be sure to open to new ideas!";
    }

    @RequestMapping("/seer/")
    // url: /rparam/?q=foo
    public String index(@RequestParam(value="q", required=false) String searchQuery){
        return "You searched for: " + searchQuery;
    }

    @RequestMapping("/seer/travel/{e}")
    public String travel(@PathVariable("e") String e){
        return String.format("<h1>Congratulations you will travel to %s</h1>", e.toUpperCase());
    }

    @RequestMapping("/seer/lotto/{e}")
    public String lotto(@PathVariable("e") int e){
        String result = ( e % 2 == 0)? "You will take a grand journey in the near future, but be weary of tempting offers.." : "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends...";
        return "<h1>" + result + "</h1>";
    }

} //class