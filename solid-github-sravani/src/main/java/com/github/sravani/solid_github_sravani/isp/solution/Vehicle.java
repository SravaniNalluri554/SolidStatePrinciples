package com.github.sravani.solid_github_sravani.isp.solution;

public abstract class Vehicle implements EngineSwitch {

    private boolean engineRunning;

    public boolean isEngineRunning() {
        return engineRunning;
    }

    public void startEngine() {
        engineRunning = true;
    }

    public void shutDownEngine() {
        engineRunning = false;
    }

}