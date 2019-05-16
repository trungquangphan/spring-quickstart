package vn.codegymdanang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.codegymdanang.service.ProductService;

import java.util.List;

@Controller
@RequestMapping(value = "/greeting")
public class GreetingController {

    @Autowired
    private ProductService productService;

    @GetMapping("")
    public ModelAndView greeting(String username){
        List<String> products = productService.getProducts();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("product");
        mv.addObject("products", products);
        return mv;
    }

}
