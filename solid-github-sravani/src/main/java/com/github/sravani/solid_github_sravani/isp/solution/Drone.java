package com.github.sravani.solid_github_sravani.isp.solution;

public class Drone extends Vehicle implements CameraSwitch {

    private boolean cameraOn;

    public boolean isCameraOn() {
        return cameraOn;
    }

    public void turnCameraOn() {
        cameraOn = true;
    }

    public void turnCameraOff() {
        cameraOn = false;
    }
}
