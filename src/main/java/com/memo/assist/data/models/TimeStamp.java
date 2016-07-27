package com.memo.assist.data.models;

/**
 * Created by dhuiying on 14.07.16.
 */
public class TimeStamp {

    private int value;

    public TimeStamp(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) throws IllegalArgumentException{
        if(value <= 0)
        {
            throw new IllegalArgumentException("the argument should be larger than zero!");
        }
        this.value = value;
    }
}
