package com.sarom.hopperreceipt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//import ch.qos.logback.core.model.Model; => this import gives you model error
import org.springframework.ui.Model;

@Controller
public class HopperController {

    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Jim Popper";
        String itemName = "golden wire";
        double price = 7.25;
        String description = "No nanoseconds here.";
        String vendor = "Big Store Down The Block";
    
    	// Your code here! Add values to the view model to be rendered
        model.addAttribute("name", name);
        model.addAttribute("item", itemName);
        model.addAttribute("price", price);
        model.addAttribute("description", description);
        model.addAttribute("vendor", vendor);
        
    
        return "index.jsp";
    }
    //...
}
