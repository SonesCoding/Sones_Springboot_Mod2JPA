package com.FSA.Sones_Springboot_Module2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class controller {

    @GetMapping("/")
    public String Showhome(){
        return "home";
    }
}