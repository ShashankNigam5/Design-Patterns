package com.designpattern.strategy1.model;

//import com.designpattern.practice.model.*;

import com.designpattern.strategy1.controller.ScoreBoardBase;

public class Balloon extends ScoreBoardBase {

    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps*multiplier)-20;
    }
}