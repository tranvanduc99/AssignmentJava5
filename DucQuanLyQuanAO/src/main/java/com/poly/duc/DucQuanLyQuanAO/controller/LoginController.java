package com.poly.duc.DucQuanLyQuanAO.controller;

import com.poly.duc.DucQuanLyQuanAO.model.Product;
import com.poly.duc.DucQuanLyQuanAO.model.Users;
import com.poly.duc.DucQuanLyQuanAO.sevice.UsersSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class LoginController {
    @Autowired
    UsersSevice usersSevice;
    @RequestMapping({"/login"})
    public String login() {
        return "/login/login";
    }

}
