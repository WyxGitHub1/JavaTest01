package com.wyx.springboot_03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @auther wyx
 * @date 2021-06-08-13:47
 */
@Controller
public class Hello {

    @RequestMapping("/hello")
    public String hellow(Model model){
        model.addAttribute("wyx", "<h1>吴余星</h1>");

        model.addAttribute("users", Arrays.asList("wyx","zyy"));
        return "hello";
    }
}
