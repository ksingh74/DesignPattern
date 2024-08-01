package CostComputationModule;

import GateModule.Ticket;

public interface PricingStrategy {
    public Integer getPrice(Ticket ticket);
}
