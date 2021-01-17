package com.designpattern.strategy1.controller;

public class ScoreBoard {
    public ScoreBoardBase scoreBoardBase;

    public void showScore(int taps, int multiplier){
        System.out.println(scoreBoardBase.calculateScore(taps,multiplier));
    }
}
