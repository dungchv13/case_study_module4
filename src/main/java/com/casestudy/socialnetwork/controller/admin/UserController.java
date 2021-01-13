package com.casestudy.socialnetwork.controller.admin;


import com.casestudy.socialnetwork.model.entities.User;
import com.casestudy.socialnetwork.model.services.I_SERVICES.UserRoleService;
import com.casestudy.socialnetwork.model.services.I_SERVICES.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("admin/user")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping
    public String getAll(Model model){
        List<User> userList = userService.getAll();
        model.addAttribute("userList",userList);
        return "admin/user";
    }

    @PostMapping("/update")
    public String update(User user){
        user.setModifyDate(Date.valueOf(LocalDate.now()));
        userService.save(user);
        return "redirect:/admin/user";
    }

    @GetMapping("/find/{id}")
    @ResponseBody
    public Optional<User> findById(@PathVariable("id") Integer id){

        Optional<User> user = userService.findById(id);

        return user;
    }
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        userService.delete(id);
        return "redirect:/admin/user";
    }


}
