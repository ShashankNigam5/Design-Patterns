package com.designpattern.Decorator.model;

import com.designpattern.Decorator.interfaces.IceCream;
import com.designpattern.Decorator.interfaces.IceCreamDecorator;

public class ChocolateIceCream extends IceCreamDecorator {

    @Override
    public double cost() {
        System.out.println("Adding Chocolate ice cream");
        return 30.50 + super.cost();
    }

    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }
}
