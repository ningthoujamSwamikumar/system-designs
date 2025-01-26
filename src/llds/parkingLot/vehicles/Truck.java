package llds.parkingLot.vehicles;

public class Truck extends Vehicle{
    public Truck(String name) {
        super(VehicleType.TRUCK, VehicleType.TRUCK.ordinal(), name);
    }
}
