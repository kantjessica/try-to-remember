package com.memo.assist.simulation;


import com.memo.assist.data.models.RepHistory;

/**
 * this interface simulates the process that a human remembers a concept as time goes by.
 * Created by dhuiying on 27.07.16.
 */
public interface Simulation {
    /**
     * prepare for the initial status of the simulation
     */
    void init();

    /**
     * start a simulation
     */
    void run();

    /**
     * check if the simulation is finished
     * @return return true if it is finished, otherwise false
     */
    boolean isFinished();

    /**
     * return the repetition history
     * @return repetition history
     */
    RepHistory getSimulatedHistory();
}
