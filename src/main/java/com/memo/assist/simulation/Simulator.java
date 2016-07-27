package com.memo.assist.simulation;

import com.memo.assist.data.models.RepHistory;
import com.memo.assist.data.models.Retrievability;

/**
 * Created by dhuiying on 27.07.16.
 */
public class Simulator implements Simulation {
    private static final int MAX_DAYS_DIFF = 60;
    private RepHistory repHistory;

    /**
     * prepare for the initial status of the simulation
     */
    @Override
    public void init() {

    }

    /**
     * start a simulation
     */
    @Override
    public void run() {

    }

    /**
     * check if the simulation is finished
     *
     * @return return true if it is finished, otherwise false
     */
    @Override
    public boolean isFinished() {
        int startDayInCurrentRepetition = (int)repHistory.getCurrentForgetCurve().apply(new Retrievability(1));
        int currentBestRepetitionTime = repHistory.getCurrentBestRepetitionTime();
        if((currentBestRepetitionTime - startDayInCurrentRepetition) > MAX_DAYS_DIFF){
            return true;
        }
        return false;
    }

    /**
     * return the repetition history
     *
     * @return repetition history
     */
    @Override
    public RepHistory getSimulatedHistory() {
        return null;
    }
}
