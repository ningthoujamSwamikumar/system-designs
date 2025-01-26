package llds.parkingLot.vehicles;

public class Bike extends Vehicle{

    public Bike(String name) {
        super(VehicleType.BIKE, VehicleType.BIKE.ordinal(), name);
    }
}
