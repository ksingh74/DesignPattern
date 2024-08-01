package CostComputationModule;

import GateModule.Ticket;

public class CostComputation {
    private PricingStrategy pricingStrategy;

    public Integer getParkingCost(Ticket ticket) {
        return ticket.getParkingSpot().getPrice();
    }
}
