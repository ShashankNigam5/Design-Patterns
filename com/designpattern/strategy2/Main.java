package com.designpattern.strategy2;

import com.designpattern.strategy2.controller.CreditCardAlgorithm;
import com.designpattern.strategy2.controller.PayPalAlgorithm;
import com.designpattern.strategy2.controller.ShoppingCart;
import com.designpattern.strategy2.model.Product;

public class Main {

    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();
        Product pants = new Product("234",25);
        Product shirts = new Product("235",28);

        cart.addProduct(pants);
        cart.addProduct(shirts);

        //payment decisions
        cart.pay(new CreditCardAlgorithm("Shahsank", "12345678"));

        cart.pay(new PayPalAlgorithm("shashank@gmail.com", "abc"));
    }
}
