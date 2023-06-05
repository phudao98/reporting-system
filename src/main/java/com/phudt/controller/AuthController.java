package com.phudt.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

@Controller
public class AuthController {
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminPage(Model model) {
        return "adminPage";
    }

    @RequestMapping(value = {"/login", "/"}, method = RequestMethod.GET)
    public String loginPage(Model model ) {

        return "login";
    }

    @RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
    public String logoutSuccessfulPage(Model model) {
        model.addAttribute("title", "Logout");
        return "logoutSuccessfulPage";
    }

    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    public String userInfo(Model model, Principal principal) {


        // Sau khi user login thanh cong se co principal
        String userName = principal.getName();

        System.out.println("User Name: "+ userName);

        return "userInfoPage";
    }
}
