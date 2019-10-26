package com.chenk.project1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class project1Controller {


    @ResponseBody
    @RequestMapping(value = "/getStr1")
    public String getStr(){
        return "This is project1,function is getStr()";
    }
}
