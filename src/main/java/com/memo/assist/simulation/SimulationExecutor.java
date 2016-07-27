package com.memo.assist.simulation;

/**
 * this class is responsible for executing all different types of simulators
 * Created by dhuiying on 27.07.16.
 */
public class SimulationExecutor {

    private Simulation easySimulator;
    private Simulation hardSimulator;

    public Simulation getEasySimulator() {
        return easySimulator;
    }

    public void setEasySimulator(Simulation easySimulator) {
        this.easySimulator = easySimulator;
    }

    public Simulation getHardSimulator() {
        return hardSimulator;
    }

    public void setHardSimulator(Simulation hardSimulator) {
        this.hardSimulator = hardSimulator;
    }
}
