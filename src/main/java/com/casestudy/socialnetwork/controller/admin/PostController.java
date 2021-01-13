package com.casestudy.socialnetwork.controller.admin;

import com.casestudy.socialnetwork.model.entities.Post;
import com.casestudy.socialnetwork.model.services.I_SERVICES.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("admin/post")
public class PostController {
    @Autowired
    private PostService postService;
    @GetMapping
    public String post(Model model){
        List<Post> postList = postService.getAll();
        model.addAttribute("postList",postList);
        return "admin/post";
    }
}
