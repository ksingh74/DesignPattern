package ParkingSpotPack;

import VehiclePack.Vehicle;

public class TwoWheelerSpot extends ParkingSpot{
    Integer price = 20;

    public TwoWheelerSpot(Integer id, Boolean isEmpty, Vehicle parkedVehicle, Integer price) {
        super(id, isEmpty, parkedVehicle, price);
    }
}
