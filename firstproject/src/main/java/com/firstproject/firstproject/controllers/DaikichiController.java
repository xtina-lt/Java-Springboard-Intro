package com.firstproject.firstproject.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiController {
    
    @RequestMapping("/daikichi")
    public String daiki(){
        return "Welcome";
    }

    @RequestMapping("/daikichi/today")
    public String today(){
        return "Today you will find luck in all your endeavors!";
    }

    @RequestMapping("/daikichi/tomorrow")
    public String tomorrow(){
        return "Tomorrow, an opportunity will arise, so be sure to open to new ideas!";
    }

    @RequestMapping("/")
    public String index(@RequestParam(value="q", required=false) String searchQuery){
        return "You searched for: " + searchQuery;
    }
}
