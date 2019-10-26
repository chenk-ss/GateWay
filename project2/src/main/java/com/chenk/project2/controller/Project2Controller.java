package com.chenk.project2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Project2Controller {


    @ResponseBody
    @RequestMapping(value = "/getStr2")
    public String getStr(){
        return "This is project2,function is getStr()";
    }
}
