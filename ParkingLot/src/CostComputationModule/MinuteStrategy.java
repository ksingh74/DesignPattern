package CostComputationModule;

import GateModule.Ticket;

public class MinuteStrategy implements PricingStrategy {
    @Override
    public Integer getPrice(Ticket ticket) {
        return 10;
    }
}
