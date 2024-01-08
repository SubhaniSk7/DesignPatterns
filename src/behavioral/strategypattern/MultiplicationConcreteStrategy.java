package behavioral.strategypattern;

public class MultiplicationConcreteStrategy implements OperationStrategy {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
