package structural.decorator.example1;

public class SugarCoffee extends CoffeeDecorator {
    public SugarCoffee(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 2;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with sugar";
    }
}
