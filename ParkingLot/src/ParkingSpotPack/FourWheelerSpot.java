package ParkingSpotPack;

import VehiclePack.Vehicle;

public class FourWheelerSpot extends ParkingSpot{
    Integer price = 60;
    public FourWheelerSpot(Integer id, Boolean isEmpty, Vehicle parkedVehicle, Integer price) {
        super(id, isEmpty, parkedVehicle, price);
    }
}
