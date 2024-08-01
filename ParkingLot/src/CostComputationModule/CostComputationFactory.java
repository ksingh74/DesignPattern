package CostComputationModule;

import GateModule.Ticket;
import VehiclePack.VehicleType;

public class CostComputationFactory {
    public CostComputation getCostComputation(Ticket ticket) {
        if (ticket.getVehicle().getType().equals(VehicleType.TWO_WHEELER)) {
            return new TwoWheelerCostComputation();
        } else if (ticket.getVehicle().getType().equals(VehicleType.FOUR_WHEELER)) {
            return new FourWheelerCostComputation();
        }
        return null;
    }
}
