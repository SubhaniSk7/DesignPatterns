package behavioral.strategypattern;

public class SubtractionConcreteStrategy implements OperationStrategy {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
