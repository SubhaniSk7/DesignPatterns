package behavioral.strategypattern;

public class AdditionConcreteStrategy implements OperationStrategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
