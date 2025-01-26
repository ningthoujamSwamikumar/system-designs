package llds.parkingLot;

import llds.parkingLot.vehicles.Bike;
import llds.parkingLot.vehicles.Car;
import llds.parkingLot.vehicles.Truck;
import llds.parkingLot.vehicles.Vehicle;

import java.util.Map;

import static llds.parkingLot.vehicles.VehicleType.*;

public class Main {
    public static void main(String[] args) {
        ParkingLevel level1 = new ParkingLevel(Map.of(BIKE.ordinal(), 5, CAR.ordinal(), 3, TRUCK.ordinal(), 2));
        ParkingLevel level2 = new ParkingLevel(Map.of(MOTORCYCLE.ordinal(), 5, MINI_TRUCK.ordinal(), 2));
        level1.setNextParkingLevel(level2);

        ParkingLot.create(level1);
        ParkingLot parkingLot = ParkingLot.getInstance();

        Vehicle car1 = new Car("car1");
        Vehicle car2 = new Car("car2");
        Vehicle car3 = new Car("car3");
        Vehicle car4 = new Car("car4");
        Vehicle car5 = new Car("car5");
        Vehicle car6 = new Car("car6");

        Vehicle bike1 = new Bike("bike1");
        Vehicle bike2 = new Bike("bike2");
        Vehicle bike3 = new Bike("bike3");
        Vehicle bike4 = new Bike("bike4");

        Truck truck1 = new Truck("truck1");

        assert parkingLot != null;

        System.out.println("parking car1, 2, 3 and 4");
        parkingLot.park(car2);
        parkingLot.park(car1);
        parkingLot.park(car3);
        parkingLot.park(car4);

        parkingLot.display();

        System.out.println("parking car5, and 6, and bike1, 2, 3, and 4");
        parkingLot.park(car5);
        parkingLot.park(car6);

        parkingLot.park(bike1);
        parkingLot.park(bike2);
        parkingLot.park(bike3);
        parkingLot.park(bike4);

        parkingLot.display();

        System.out.println("parking truck1");
        parkingLot.park(truck1);

        parkingLot.display();

        System.out.println("unparking bike1, 2, and car 5, 2");
        parkingLot.unpark(bike1);
        parkingLot.unpark(bike2);
        parkingLot.unpark(car5);
        parkingLot.unpark(car2);

        parkingLot.display();

    }
}
