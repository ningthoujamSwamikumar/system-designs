### Requirements
1. The parking lot should have multiple levels, each level with a certain number of parking spots.
2. The parking lot should support different types of vehicles, such as cars, motorcycles, and trucks.
3. Each parking spot should be able to accommodate a specific type of vehicle.
4. The system should assign a parking spot to a vehicle upon entry and release it when the vehicle exits.
5. The system should track the availability of parking spots and provide real-time information to customers.
6. The system should handle multiple entry and exit points and support concurrent access.

### Design Components
- vehicle - car, bike, truck, motorcycle, etc. 
- parking levels
- parking spot
- parking gate - entrance and exit
- parking_manager - will manage the parkings

### Components
vehicle [ getName(); getType(); getSize(); ] \
level [ getSpot(size); getLevelSize(); getLevelNum();] \
spot [ getSize(); getVehicle(); isEmpty(); ] \
lot [ singleTon(); park(vechile); unpark(vehicle);]

parking flow: 
> lot.park(vehicle) \
    spot = getSpot(vehicle.getSize()) \
    spot.park(vehicle) \
    map.put(vehicle, spot); \

unparking flow: 
> lot.unpark(vehicle); \
    spot = map.get(vehicle); \
    spot.unpark() \
    print("done");

concepts and patterns used:
> - State pattern is used to implement different cars.
> - Chain of responsibility principle is used to implement parking level chains.
> - Singleton pattern is used to implement single instance for parking lot.
> - 'synchronized' methods are used to synchronize concurrent access of parking lot and levels.