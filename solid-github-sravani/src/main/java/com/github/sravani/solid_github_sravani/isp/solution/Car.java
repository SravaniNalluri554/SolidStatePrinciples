package com.github.sravani.solid_github_sravani.isp.solution;

public class Car extends Vehicle implements RadioSwitch {

    private boolean radioOn;

    public boolean isRadioOn() {
        return radioOn;
    }
    
    public void turnRadioOn() {
        radioOn = true;
    }

    public void turnRadioOff() {
        radioOn = false;
    }

}