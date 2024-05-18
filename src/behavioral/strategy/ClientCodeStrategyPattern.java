package behavioral.strategy;

public class ClientCodeStrategyPattern {

    public void execute() {

        // This logic of setting right strategy can be moved to Factory class.
        Strategy add = new AdditionStrategy();
        Strategy sub = new SubtractionStrategy();

        StrategyContext strategyContext = new StrategyContext();

        String operation = "add";// It can be dynamic.

        if ("add".equals(operation)) {
            strategyContext.setStrategy(add);
        } else {
            strategyContext.setStrategy(sub);
        }
        
        strategyContext.executeStrategy(5, 2);
    }
}
