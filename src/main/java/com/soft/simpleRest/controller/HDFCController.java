package com.soft.simpleRest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hdfc")
public class HDFCController {

    @RequestMapping("/savings")
    //http://localhost:8080/hdfc/savings
    public String getSavingsDetails(){
        return "Savings Account";
    }

    @RequestMapping("/current")
    //http://localhost:8080/hdfc/current
    public String getCurrentAccountDetails(){
        return "Current Account";
    }

    @RequestMapping("/credit")
    //http://localhost:8080/hdfc/credit
    public String getCreditAccountDetails(){
        return "Credit Account";
    }

    @RequestMapping("/houseloan")
    //http://localhost:8080/hdfc/houseloan
    public String getHouseLoanDetails(){
        return "House Loan Account";
    }

}
