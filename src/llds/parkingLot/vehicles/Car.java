package llds.parkingLot.vehicles;

public class Car extends Vehicle{

    public Car(String name){
        super(VehicleType.CAR, VehicleType.CAR.ordinal(), name);
    }
}
