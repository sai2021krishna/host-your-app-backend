package com.hostYourAppGroup.host_your_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hostYourAppGroup.host_your_app.service.LoginService;

@Controller
public class LoginController {
    private final LoginService loginService;

    public LoginController(LoginService loginService){
        this.loginService = loginService;
    }
    
    @RequestMapping("/login")
    @ResponseBody
    public String login() {
        //return "data";
        return this.loginService.lserve();
    }
}
