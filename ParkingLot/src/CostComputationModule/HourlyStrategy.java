package CostComputationModule;

import GateModule.Ticket;

public class HourlyStrategy implements PricingStrategy {
    @Override
    public Integer getPrice(Ticket ticket) {
        return 34;
    }
}
