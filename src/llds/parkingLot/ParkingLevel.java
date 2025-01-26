package llds.parkingLot;

import llds.parkingLot.vehicles.Vehicle;
import llds.parkingLot.vehicles.VehicleType;

import java.util.*;

public class ParkingLevel {
    private final List<ParkingSpot> spots;
    private int maxSpotSize = 0;
    private final Map<Integer, LinkedList<Integer>> sizeToSpotIndices = new HashMap<>(); //size to #spots

    private ParkingLevel nextParkingLevel;

    public ParkingLevel(List<ParkingSpot> spots){
        this.spots = spots;
        for(int i=0; i<spots.size(); i++){
            int size = spots.get(i).getSize();
            maxSpotSize = Math.max(maxSpotSize, size);
            if(!sizeToSpotIndices.containsKey(size))
                sizeToSpotIndices.put(size, new LinkedList<>());
            sizeToSpotIndices.get(size).add(i);
        }
    }

    public ParkingLevel(Map<Integer, Integer> sizeToCapacity){
        this.spots = new ArrayList<>();
        for(int size : sizeToCapacity.keySet()){
            for(int j=0; j<sizeToCapacity.get(size); j++) {
                if (!sizeToSpotIndices.containsKey(size))
                    sizeToSpotIndices.put(size, new LinkedList<>());
                sizeToSpotIndices.get(size).add(spots.size());
                spots.add(new ParkingSpot(size));
            }
            maxSpotSize = Math.max(maxSpotSize, size);
        }
    }

    public synchronized ParkingSpot getSpot(int size){
        if(!sizeToSpotIndices.containsKey(size) || sizeToSpotIndices.get(size).isEmpty())
            return nextParkingLevel != null ? nextParkingLevel.getSpot(size) : null;
        ParkingSpot spot = spots.get(sizeToSpotIndices.get(size).pop());
        if(!spot.isAvailable()) throw new RuntimeException("Something Went Wrong! Spot is not available.");
        return spot;
    }

    public synchronized boolean returnSpot(ParkingSpot spot){
        if(!spots.contains(spot)){
            return nextParkingLevel != null && nextParkingLevel.returnSpot(spot);
        }
        if(!spot.isAvailable()) throw new RuntimeException("Something Went Wrong! Spot is not available.");
        sizeToSpotIndices.get(spot.getSize()).add(spots.indexOf(spot));
        return true;
    }

    public void setNextParkingLevel(ParkingLevel nextParkingLevel) {
        this.nextParkingLevel = nextParkingLevel;
    }

    public int getMaxSpotSize(){
        return nextParkingLevel != null ? Math.max(maxSpotSize, nextParkingLevel.getMaxSpotSize()) : maxSpotSize;
    }

    public void display() {
        System.out.println("====== NEW LEVEL ======");
        for (ParkingSpot spot : spots){
            if(spot.isAvailable())
                System.out.printf("%s %s spot\n", "AVAILABLE", VehicleType.getByOrdinal(spot.getSize()));
            else if(spot.getVehicle().getSize() != spot.getSize())
                System.out.printf("%s spot is %s by %s\n", VehicleType.getByOrdinal(spot.getSize()), "OCCUPIED", spot.getVehicle().getVehicleType());
            else
                System.out.printf("%s %s spot\n", "OCCUPIED", VehicleType.getByOrdinal(spot.getSize()));
        }

        if(nextParkingLevel!=null) nextParkingLevel.display();
    }
}
