package GateModule;

import CostComputationModule.CostComputation;
import CostComputationModule.CostComputationFactory;
import ParkingSpotPack.ParkingSpotManagerFactory;

import java.util.ArrayList;

public class ExitGate {

    /*
    * Exit gate will have parkingSpotManagerFactory to remove Vehicle
    * Also a module for payment calculation
    * */
    private ParkingSpotManagerFactory parkingSpotManagerFactory;
    private CostComputationFactory costComputationFactory;

    public void removeVehicle(Ticket ticket) {
        parkingSpotManagerFactory.getParkingSpotManager(ticket.getVehicle().getType(), new ArrayList<>()).removeVehicle(ticket.getVehicle(), ticket.getParkingSpot());
    }

    public Integer calculateCost(Ticket ticket) {
        CostComputation costComputation = costComputationFactory.getCostComputation(ticket);
        costComputation.getParkingCost(ticket);
        return 0; // random incomplete
    }
}
