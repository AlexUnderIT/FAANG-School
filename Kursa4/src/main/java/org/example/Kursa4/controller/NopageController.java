package org.example.Kursa4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NopageController {
    @GetMapping("/nopage")
    public String ShowNopagePage(){
        return "nopage";
    }
}