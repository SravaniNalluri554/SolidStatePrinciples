package com.github.sravani.solid_github_sravani.dip.solution;
public class Driver {

    private Vehicle vehicle;

    public Driver(final Vehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public void increaseSpeed(){
        vehicle.accelerate();
    }
}
