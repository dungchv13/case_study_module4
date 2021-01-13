package com.casestudy.socialnetwork.controller.user;

import com.casestudy.socialnetwork.model.entities.User;
import com.casestudy.socialnetwork.model.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/user")
public class ProfileController {
    @Autowired
    private UserServiceImpl userServiceimpl;
    @GetMapping("/profile/{id}")
    public String getUserProfile(@PathVariable int id, Model model){
        Optional<User> user = userServiceimpl.findById(id);
        model.addAttribute("user", user);
        return "profile";
    }


}
