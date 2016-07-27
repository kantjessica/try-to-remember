package com.memo.assist.data.models;

import com.memo.assist.computing.ForgetCurve;

import java.util.ArrayList;
import java.util.List;

/**
 * this class represents the history of the repetitions
 * Created by dhuiying on 14.07.16.
 */
public class RepHistory {
    static{
        final float BEST_RETRIVABILITY_LEVEL = 0.9f;
        bestRetr = new Retrievability(BEST_RETRIVABILITY_LEVEL);
    }
    public static final int INITIAL_ROUND = 0;
    private Difficulty difficulty;
    private static final Retrievability bestRetr;
    private List<ForgetCurve> forgetCurveList;
    private Repetition currentRep;
    private List<TimeStamp> timeStampList;

    public RepHistory(Difficulty difficulty){
        timeStampList = new ArrayList<>();
        timeStampList.add(new TimeStamp(0));
        this.difficulty = difficulty;
        currentRep = new Repetition(INITIAL_ROUND);//set the initial round
        forgetCurveList = new ArrayList<>();
        ForgetCurve initForgetCurve = new ForgetCurve(new TimeStamp(0), new TimeStamp(0),
                new Repetition(0), difficulty, null);
        forgetCurveList.add(initForgetCurve);
    }

    public void addForgetCurve(Feedback feedback, Repetition currentRep, TimeStamp currentTime){
        //calculate the parameter for the latest forget curve
        TimeStamp lastTime = timeStampList.get(timeStampList.size()-1);
        ForgetCurve currentForgetCurve = new ForgetCurve(currentTime, lastTime,
                currentRep, this.difficulty, feedback);
        forgetCurveList.add(currentForgetCurve);
    }

    /**
     * get the current best repetition time. It rounds down the double result.
     * For instance, 1.67 -> 1
     * @return
     */
    public int getCurrentBestRepetitionTime(){
        return (int)forgetCurveList.get(forgetCurveList.size()-1).apply(bestRetr);
    }

    public Repetition getCurrentRep() {
        return currentRep;
    }
}
