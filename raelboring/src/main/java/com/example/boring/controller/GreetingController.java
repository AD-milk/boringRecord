package com.example.boring.controller;

import com.example.boring.pojo.FullDate;
import com.example.boring.service.CalDateService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class GreetingController {
    private final CalDateService calDateService;

    public GreetingController(CalDateService calDateService) {
        this.calDateService = calDateService;
    }

    @GetMapping("/greeting")
    public String greeting(Model model) throws JsonProcessingException {

        List<FullDate> list = calDateService.queryFirstFive();
        model.addAttribute("calDates",list);
        return "index";
    }

}
