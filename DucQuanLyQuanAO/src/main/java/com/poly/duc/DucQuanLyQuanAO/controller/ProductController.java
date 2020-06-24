package com.poly.duc.DucQuanLyQuanAO.controller;


import com.poly.duc.DucQuanLyQuanAO.model.Product;
import com.poly.duc.DucQuanLyQuanAO.sevice.ProductSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductSevice productSevice;

    @RequestMapping({"/table"})
    public String home(Model model){
        List<Product> productList = productSevice.findAllProduct();
        model.addAttribute("product",productList);
        return "/web/table";
    }

    @RequestMapping({"/add"})
    public String addProduct(Model model){
        Product addProduct = new Product();
        model.addAttribute("product",addProduct);
        return "/web/insertproduct";
    }

    @RequestMapping(value = "/save")
    public String save(@ModelAttribute("product") Product product){
       productSevice.saveProduct(product);
       return "redirect:/table";
    }
    @RequestMapping(value = "delete/{Id}")
    public String delete(@PathVariable(name = "Id") Integer Id){
        productSevice.deleteProduct(Id);
        return "redirect:/table";
    }

    @RequestMapping(value="edit/{Id}")
    public ModelAndView edit(@PathVariable(name="Id") Integer Id) {
        ModelAndView mav = new ModelAndView("/web/editproduct") ;
        Product productEdit = productSevice.findProductById(Id);
        System.out.print(productEdit.getName());
        mav.addObject("product" ,productEdit );
        return mav;
    }

        }
