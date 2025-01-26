package llds.parkingLot;

import llds.parkingLot.vehicles.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private static ParkingLot instance;

    private ParkingLevel parkingLevel;

    private final Map<Vehicle, ParkingSpot> vehicleToSpot = new HashMap<>();

    private ParkingLot(){}

    public static void create(ParkingLevel parkingLevel){
        if(instance != null){
            System.out.println("instance already created. can't create again!");
            return;
        }
        instance = new ParkingLot();
        instance.parkingLevel = parkingLevel;
    }

    public static ParkingLot getInstance(){
        if(instance == null){
            System.out.println("Please create an instance first using create method.");
            return null;
        }
        System.out.println();
        return instance;
    }

    public boolean park(Vehicle vehicle){
        ParkingSpot spot = null;
        if(vehicleToSpot.containsKey(vehicle)) {
            System.out.println("Vehicle has already been parking at " + vehicleToSpot.get(vehicle));
            return false;
        }
        for(int i=vehicle.getSize(); i<= parkingLevel.getMaxSpotSize() && spot==null; i++)
            spot = parkingLevel.getSpot(i);

        if(spot==null){
            System.out.printf("%s %s is not available a spot to park.\n", vehicle.getVehicleType(), vehicle.getName());
            return false;
        }
        spot.park(vehicle);
        vehicleToSpot.put(vehicle, spot);

        System.out.printf("%s %s is parked\n", vehicle.getVehicleType(), vehicle.getName());

        return true;
    }

    public void unpark(Vehicle vehicle){
        ParkingSpot spot = vehicleToSpot.remove(vehicle);
        if(spot == null) throw new RuntimeException("Vehicle not found!");
        spot.unpark();
        parkingLevel.returnSpot(spot);

        System.out.printf("%s %s is unparked\n", vehicle.getVehicleType(), vehicle.getName());

    }

    public void display(){
        System.out.println("PARKING LOT DISPLAY:");
        parkingLevel.display();
        System.out.println(" ---- X ------ X ------ X ----- X");
    }
}
