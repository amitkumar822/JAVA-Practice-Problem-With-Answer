package Vehicle;

import Vehicle.Car;
import Vehicle.Vehicle;

public class VehicleUse extends Car {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.setMaxSpeed(12);
        v.color = "White";
        v.print();

        Car c = new Car();
        c.numGears=10;
        c.setMaxSpeed(155);
        c.color ="black";
        c.carprint();
    }
}
