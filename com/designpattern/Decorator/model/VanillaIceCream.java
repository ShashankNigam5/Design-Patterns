package com.designpattern.Decorator.model;

import com.designpattern.Decorator.interfaces.IceCream;
import com.designpattern.Decorator.interfaces.IceCreamDecorator;

public class VanillaIceCream extends IceCreamDecorator {

    @Override
    public double cost() {
        System.out.println("Adding Vanilla ice cream");
        return 10+super.cost();
    }

    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
    }

}
