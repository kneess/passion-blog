package com.campos.brainamplified.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = {"/","/home"})
    public String getHome()
    {
        return "Home page";
    }
}
