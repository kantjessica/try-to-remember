package com.memo.assist.data.models;

/**
 * this class represents the level of difficulty regarding concept to remember
 * Created by dhuiying on 14.07.16.
 */
public enum Difficulty {
    VERY_EASY(1),
    EASY(2),
    NORMAL(3),
    DIFFICULT(4),
    VERY_DIFFICULT(5);

    private final int index;

    Difficulty(int index) {
        this.index = index;
    }

    public int getDifficultyValue(){
        return index;
    }
}
