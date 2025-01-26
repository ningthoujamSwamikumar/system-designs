package llds.parkingLot;

import llds.parkingLot.vehicles.Vehicle;

public class ParkingSpot {
    private int size;
    private Vehicle vehicle;

    public ParkingSpot(int size){
        this.size = size;
    }

    public int getSize(){
        return this.size;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public boolean isAvailable(){
        return vehicle == null;
    }

    public void park(Vehicle vehicle){
        if(this.size < vehicle.getSize()) throw new RuntimeException("Unfit Size: Vehicle size is not fit inside this spot.");
        if(this.vehicle != null) throw new RuntimeException("Non empty: assigning a vehicle at a non empty spot");
        this.vehicle = vehicle;
    }

    public void unpark(){
        if(vehicle==null) throw new RuntimeException("Empty spot: This parking spot is empty!");
        this.vehicle = null;
    }
}
