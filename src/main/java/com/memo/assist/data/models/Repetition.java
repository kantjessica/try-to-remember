package com.memo.assist.data.models;

/**
 * Created by dhuiying on 14.07.16.
 */
public class Repetition {

    private int round;

    public int getRound() {
        return round;
    }

    public Repetition(int round){
        this.round = round;
    }

    public void setRound(int round) throws IllegalArgumentException{
        if(round <= 0)
        {
            throw new IllegalArgumentException("the argument should be larger than zero!");
        }
        this.round = round;
    }
}
