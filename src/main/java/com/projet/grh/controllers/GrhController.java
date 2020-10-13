package com.projet.grh.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrhController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello this word in spring boot";
    }
}
