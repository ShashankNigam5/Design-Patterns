package com.designpattern.strategy1;

import com.designpattern.strategy1.controller.ScoreBoard;
import com.designpattern.strategy1.model.Balloon;
import com.designpattern.strategy1.model.Clown;
import com.designpattern.strategy1.model.SquareBalloon;

public class Main {
    public static void main(String[] args){

        ScoreBoard scoreBoard = new ScoreBoard();

        System.out.println("Balloon top score : ");
        scoreBoard.scoreBoardBase = new Balloon();
        scoreBoard.showScore(10,5);

        System.out.println("SquareBalloon top score : ");
        scoreBoard.scoreBoardBase = new SquareBalloon();
        scoreBoard.showScore(10,5);

        System.out.println("Clown top score : ");
        scoreBoard.scoreBoardBase = new Clown();
        scoreBoard.showScore(10,5);

    }
}
