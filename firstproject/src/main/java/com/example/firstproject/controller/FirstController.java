package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetU(Model model){
        model.addAttribute("username","sipsup");
        return "greetings"; //templates/greetings.mustache 찾아서 브라우저로 전송
    }

    @GetMapping("/bye")
    public String byetoU(Model model){
        model.addAttribute("nickname","sipsup");
        return "goodbye";
    }
}
