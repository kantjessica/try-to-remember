package com.memo.assist.data.models;

/**
 * Created by dhuiying on 14.07.16.
 */
public enum Grade {
    EASY_TO_REMEMBER(-1),
    NORMAL(0),
    DIFFICULT_TO_REMEMBER(1);

    private final int grade;

    Grade(int grade) {
        this.grade = grade;
    }

    public int getGradeValue(){
        return grade;
    }
}
