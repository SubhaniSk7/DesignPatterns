package structural.decorator.example1;

// Base Wrapper object
// this decorator has composition of Concrete interface component.
public abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;// Wrappee object

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    public double cost() {
        return decoratedCoffee.cost();
    }

    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
}
