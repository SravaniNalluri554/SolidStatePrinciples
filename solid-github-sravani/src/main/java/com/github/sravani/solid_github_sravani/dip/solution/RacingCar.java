package com.github.sravani.solid_github_sravani.dip.solution;

public class RacingCar implements Vehicle{

    private final int maxFuel;
    private int remainingFuel;
    private int power;

    public RacingCar(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }
    
    @Override
    public void accelerate() {
        power++;
        remainingFuel--;
    }
}