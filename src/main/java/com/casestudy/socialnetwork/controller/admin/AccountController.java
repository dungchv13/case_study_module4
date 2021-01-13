package com.casestudy.socialnetwork.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/account")
public class AccountController {
    @GetMapping
    public String account(){
        return "admin/account";
    }
}
