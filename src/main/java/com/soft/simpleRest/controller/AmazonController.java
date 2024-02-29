package com.soft.simpleRest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/amazon")
public class AmazonController {

    @RequestMapping("/products")
    public String getProductSection(){
        return "Amazon -- Displaying Product";
    }

    @RequestMapping("/cart")
    //http://localhost:8080/amazon/cart
    public String getCartSection(){
        return "Amazon -- Cart Section";
    }

    @RequestMapping("/discount")
    //http://localhost:8080/amazon/discount
    public String getDiscountSection(){
        return "Amazon -- Discount Section";
    }

    @RequestMapping("/return")
    //http://localhost:8080/amazon/return
    public String getReturnSection(){
        return "Amazon -- Return Section";
    }
}
