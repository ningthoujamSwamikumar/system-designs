package llds.parkingLot.vehicles;

public abstract class Vehicle {
    VehicleType vehicleType;
    int size;
    String name;

    public Vehicle(VehicleType vehicleType, int size, String name) {
        this.vehicleType = vehicleType;
        this.size = size;
        this.name = name;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

    public int getSize() {
        return this.size;
    }

    public String getName() {
        return this.name;
    }
}
