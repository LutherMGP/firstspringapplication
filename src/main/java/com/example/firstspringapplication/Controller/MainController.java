package com.example.firstspringapplication.Controller;

import com.example.firstspringapplication.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    ItemService itemService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("items", itemService.fetchAllItems());
        return "index";
    }

}
