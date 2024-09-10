package com.vehicle.test;
import com.vehicle.Car;
import com.vehicle.ElectricCar;

public class 
        VehicleTest {
    public static void main(String[] args) {
        Car car = new ElectricCar();
        car.setSpeed(100.0);
        car.setFuelLevel(50.0f);
        car.drive(5000);

        System.out.println("Car Speed in MPH: " + car.getSpeedMph());
        System.out.println("Car Distance in KM: " + car.getDistanceKm());
        System.out.println("Remaining Fuel: " + car.calculateRemainingFuel(5000));

        ElectricCar electricCar = new ElectricCar();
        electricCar.setSpeed(80.0);
        electricCar.setFuelLevel(70.0f);
        electricCar.setBatteryLevel(90.0);
        electricCar.drive(10000);

        System.out.println("Electric Car Speed in MPH: " + electricCar.getSpeedMph());
        System.out.println("Electric Car Distance in KM: " + electricCar.getDistanceKm());
        System.out.println("Remaining Fuel: " + electricCar.calculateRemainingFuel(10000));
        System.out.println("Remaining Battery: " + electricCar.getBatteryLevel());
    }

}
