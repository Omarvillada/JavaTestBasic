package com.example.javatests.player;

public class Player {

    private Dice dice;
    private int minNUmberToWin;

    public Player(Dice dice, int minNUmberToWin) {
        this.dice = dice;
        this.minNUmberToWin = minNUmberToWin;
    }

    public boolean play(){
        int diceNumber = dice.roll();
        return diceNumber > minNUmberToWin;
    }
}
