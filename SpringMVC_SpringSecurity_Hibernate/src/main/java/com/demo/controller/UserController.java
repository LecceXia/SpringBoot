package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.security.Principal;

@Controller
public class UserController {

    public String index(Model model, Principal principal){
        model.addAttribute("message","You are logged in as"+principal.getName());
        return "index";
    }
}
