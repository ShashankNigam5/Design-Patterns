package com.designpattern.Decorator.model;

import com.designpattern.Decorator.interfaces.IceCream;

public class BasicIceCream implements IceCream {

    public BasicIceCream() {
        System.out.println("Crating a basic Ice-Cream");
    }

    @Override
    public double cost() {
        return 20.00;
    }
}
