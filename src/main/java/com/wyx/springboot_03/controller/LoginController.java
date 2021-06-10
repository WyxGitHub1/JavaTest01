package com.wyx.springboot_03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

/**
 * @auther wyx
 * @date 2021-06-09-15:00
 */
@Controller
@RequestMapping("/user")
public class LoginController {

    @RequestMapping("/login")
    public String login(String username, String password, Model model, HttpSession session){

        if(StringUtils.isEmpty(username) || !"123456".equals(password)){
            model.addAttribute("msg","用户名密码错误");
            return "index";
        }

        session.setAttribute("loginUser",username);

        return "redirect:/main.html";
    }
}
