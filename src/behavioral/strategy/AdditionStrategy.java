package behavioral.strategy;

// Concrete strategy.
public class AdditionStrategy implements Strategy {

    @Override
    public void execute(int a, int b) {
        System.out.println("Addition: " + a + " + " + b + " = " + (a + b));
    }
}
