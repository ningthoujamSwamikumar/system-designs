package llds.parkingLot.vehicles;

public enum VehicleType {
    BIKE, MOTORCYCLE, CAR, MINI_TRUCK, TRUCK;

    public static VehicleType getByOrdinal(int ord){
        VehicleType[] values = VehicleType.values();
        if(ord < 0 || ord >= values.length) throw new IllegalArgumentException("ordinal " + ord + " doesn't exist!");
        return values[ord];
    }
}
