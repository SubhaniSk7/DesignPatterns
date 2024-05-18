package behavioral.visitor;

public class Electronics implements ItemElement {
    private final int price;

    public Electronics(int price) {
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
