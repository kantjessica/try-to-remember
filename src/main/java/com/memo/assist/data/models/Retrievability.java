package com.memo.assist.data.models;

/**
 * it is a probability which represents how likely one can memorize the concept.
 * Created by dhuiying on 14.07.16.
 */
public class Retrievability {

    private float value;

    public Retrievability(float value) throws IllegalArgumentException{
        if(value <= 0 || value > 1){
            throw new IllegalArgumentException("the argument should be between 0 and 1. " +
                    "And it is not equal to zero.");
        }
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
