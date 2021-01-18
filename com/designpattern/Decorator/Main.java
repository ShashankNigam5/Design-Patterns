package com.designpattern.Decorator;

import com.designpattern.Decorator.interfaces.IceCream;
import com.designpattern.Decorator.model.BasicIceCream;
import com.designpattern.Decorator.model.ChocolateIceCream;
import com.designpattern.Decorator.model.VanillaIceCream;

public class Main {
    public static void main(String[] args){
        IceCream basicIceCream = new BasicIceCream();
        System.out.println("Basic Ice-Cram cost " + basicIceCream.cost());

        IceCream vanillaIcecream = new VanillaIceCream(basicIceCream);
        System.out.println("Vanilla Ice-Cram cost " + vanillaIcecream.cost());


        IceCream chocolateIceCream = new ChocolateIceCream(vanillaIcecream);
        System.out.println("Chocolate Ice-Cram cost " + chocolateIceCream.cost());

    }
}
