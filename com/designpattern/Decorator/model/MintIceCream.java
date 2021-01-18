package com.designpattern.Decorator.model;

import com.designpattern.Decorator.interfaces.IceCream;
import com.designpattern.Decorator.interfaces.IceCreamDecorator;

public class MintIceCream extends IceCreamDecorator {

    @Override
    public double cost() {
        System.out.println("Adding mint ice cream");
        return 5+super.cost();
    }

    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }
}
