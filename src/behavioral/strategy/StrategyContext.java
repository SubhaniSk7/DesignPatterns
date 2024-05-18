package behavioral.strategy;

// Strategy context. We can pick right strategy based on our use-case dynamically.
// It can be factory class as well.
public class StrategyContext {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(int a, int b) {
        strategy.execute(a, b);
    }
}
