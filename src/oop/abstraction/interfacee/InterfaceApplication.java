package oop.abstraction.interfacee;

public class InterfaceApplication {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        FourWheeler fourWheeler = (FourWheeler) vehicle;
        vehicle.start();
        fourWheeler.fourWheelDrive();
        System.out.println("Current speed: " + vehicle.getSpeed() + " km/h");
        vehicle.stop();
    }
}
