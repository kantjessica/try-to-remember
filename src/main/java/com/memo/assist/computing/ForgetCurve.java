package com.memo.assist.computing;

import com.memo.assist.data.models.*;

/**
 * Created by dhuiying on 14.07.16.
 */
public class ForgetCurve {

    private TimeStamp currentTime;
    private TimeStamp lastTime;
    private Repetition repetition;
    private Difficulty difficulty;
    private Feedback feedback;

    public ForgetCurve(TimeStamp ts_current, TimeStamp ts_before,
                       Repetition repetition, Difficulty difficulty,
                       Feedback feedback) {
        this.currentTime = ts_current;
        this.lastTime = ts_before;
        this.repetition = repetition;
        this.difficulty = difficulty;
        this.feedback = feedback;
    }

    /**
     * calculate the inverse function. this is the core of computation. If there is a better
     * function describing forgetting curve. this method should be replaced.
     * @param retrievability the prabability one concept can be recalled
     * @return
     */
    public double apply(Retrievability retrievability){
        return currentTime.getValue()-Math.log(retrievability.getValue())
                *feedback.getGrade().getGradeValue()*repetition.getRound()
                /(difficulty.getDifficultyValue()*(currentTime.getValue()-lastTime.getValue()));
    }

    public TimeStamp getCurrentTime() {
        return currentTime;
    }

    public TimeStamp getLastTime() {
        return lastTime;
    }

    public Repetition getRepetition() {
        return repetition;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public Feedback getFeedback() {
        return feedback;
    }
}
