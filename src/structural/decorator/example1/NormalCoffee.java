package structural.decorator.example1;

public class NormalCoffee implements Coffee {
    @Override
    public double cost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Normal Coffee";
    }
}
