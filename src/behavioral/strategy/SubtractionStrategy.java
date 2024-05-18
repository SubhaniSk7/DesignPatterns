package behavioral.strategy;

// Concrete strategy.
public class SubtractionStrategy implements Strategy {

    @Override
    public void execute(int a, int b) {
        System.out.println("Subtraction: " + a + " - " + b + " = " + (a - b));
    }
}
