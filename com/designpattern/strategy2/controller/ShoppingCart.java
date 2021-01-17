package com.designpattern.strategy2.controller;

import com.designpattern.strategy2.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> productList;

    public ShoppingCart(){
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public void removeProduct(Product product){
        productList.remove(product);
    }

    public int calculateCost(){
        int sum = 0;
        for(Product p : productList){
            sum += p.getPrice();
        }
        return sum;
    }

    public void pay(Payment paymentStrategy){
        int amount = calculateCost();
        paymentStrategy.pay(amount);
    }
}
