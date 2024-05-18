package behavioral.visitor;

public class Food implements ItemElement {
    private final int price;

    public Food(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void accept(TaxVisitor visitor) {
        visitor.visit(this);
    }
}
