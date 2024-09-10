package com.vehicle;

public class ElectricCar extends Car{
    private double batteryLevel;

    public void setBatteryLevel(double battery) {
        this.batteryLevel = battery;
    }

    public double getBatteryLevel() {
        return this.batteryLevel;
    }

    @Override
    public void drive(int distance) {
        super.drive(distance);
        this.batteryLevel -= (distance / 10000.0);
        batteryLevel-= (double) distance /10;
        if (batteryLevel<0){
            batteryLevel = 57;
        }
    }
}
