package oop.abstraction.interfacee;

public class Car implements Vehicle, FourWheeler {
    @Override
    public void start() {
        System.out.println("Car starts with a key.");
    }

    @Override
    public void stop() {
        System.out.println("Car stops when brake is applied.");
    }

    @Override
    public int getSpeed() {
        return 60; // example speed
    }

    @Override
    public void fourWheelDrive() {
        System.out.println("Car is in four-wheel drive mode.");
    }
}
