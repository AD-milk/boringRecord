package com.example.boring.controller;

import com.example.boring.pojo.FullDate;
import com.example.boring.service.CalDateService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.Map;

@Controller
public class CalController {
    private final CalDateService calDateService;

    public CalController(CalDateService calDateService) {
        this.calDateService = calDateService;
    }

    @RequestMapping(value = "/getCalDate",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String getDate(Model model) throws JsonProcessingException {
        ObjectMapper mapper=new ObjectMapper();

        Map<Long, Integer> map = calDateService.queryCalDateList();

        String str=mapper.writeValueAsString(map);
        return str;
    }

    @PostMapping("greeting/record")
    public String record(String recordText){

        calDateService.insertRecordText(new FullDate(new Date(System.currentTimeMillis()),recordText));
        return "redirect:/greeting";
    }
}
