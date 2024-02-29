package com.soft.simpleRest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gateway")
public class PaymentGatewayController {

    //credit card section
    @RequestMapping("/credit")
    //http://localhost:8080/gateway/credit
    public String getCreditCard(){

        return "Gateway ==> Reached to Credit Card Section";
    } //net wallet gift

    //Net Banking Section
    @RequestMapping("/net")
    //http://localhost:8080/gateway/net
    public String getNetBanking(){

        return "Gateway ==> Reached to NetBanking Section";
    }

    //Wallet Section
    @RequestMapping("/wallet")
    //http://localhost:8080/gateway/wallet
    public String getWalletPayment(){

        return "Gateway ==> Reached to Wallet Section";
    }

    //Gift Section
    @RequestMapping("/gift")
    //http://localhost:8080/gateway/gift
    public String getGiftCard(){

        return "Gateway ==> Reached to Giftcard Section";
    }
}
