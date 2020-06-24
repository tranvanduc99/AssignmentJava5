package com.poly.duc.DucQuanLyQuanAO.controller;

import com.poly.duc.DucQuanLyQuanAO.model.Users;
import com.poly.duc.DucQuanLyQuanAO.sevice.UsersSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UsersController {
    @Autowired
    UsersSevice usersSevice;
    @RequestMapping({"/adduser"})
    public String add(Model model){
        Users addUsers = new Users();
        model.addAttribute("User", addUsers);
        return "/admin/adduser";
    }
    @RequestMapping(value = "/saveuser")
    public String save(@ModelAttribute("User") Users users){
        usersSevice.saveUsers(users);
        return "redirect:/listuser";
    }
    @RequestMapping({"/listuser"})
    public String home(Model model){
        List<Users> usersList = usersSevice.findAllUsers();
        model.addAttribute("User",usersList);
        return "/admin/listuser";
    }
}
