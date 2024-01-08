package behavioral.strategypattern;

public class CalculatorContext {
    private OperationStrategy operationStrategy;

    public void setOperationStrategy(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public int executeStrategy(int a, int b) {
        return operationStrategy.execute(a, b);
    }
}
