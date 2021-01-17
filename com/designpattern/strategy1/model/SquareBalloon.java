package com.designpattern.strategy1.model;

import com.designpattern.strategy1.controller.ScoreBoardBase;


public class SquareBalloon extends ScoreBoardBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps*multiplier)+40;
    }
}