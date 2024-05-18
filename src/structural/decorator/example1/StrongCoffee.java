package structural.decorator.example1;

// Concrete Decorator component, it adds(wraps) additional behavior to Base Concrete component.
public class StrongCoffee extends CoffeeDecorator {
    public StrongCoffee(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with strong";
    }
}
