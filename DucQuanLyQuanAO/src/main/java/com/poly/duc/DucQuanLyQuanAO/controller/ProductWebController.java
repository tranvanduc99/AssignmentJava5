package com.poly.duc.DucQuanLyQuanAO.controller;

import com.poly.duc.DucQuanLyQuanAO.model.Product;
import com.poly.duc.DucQuanLyQuanAO.sevice.ProductSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductWebController {
    @Autowired
    ProductSevice productSevice;
    @RequestMapping({"/home"})
    public String home(Model model){
        List<Product> productList = productSevice.findAllProduct();
        model.addAttribute("products",productList);
        return "/home/products";
    }
    @RequestMapping({"/test"})
    public String test(){
//        List<Product> productList = productSevice.findAllProduct();
//        model.addAttribute("products",productList);
        return "/home/index";
    }
}
