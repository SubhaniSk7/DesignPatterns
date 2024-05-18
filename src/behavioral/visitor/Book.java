package behavioral.visitor;

// Concrete element.
// it has to implement accept() method, and call visitor's method.
public class Book implements ItemElement {
    private final int price;

    public Book(int price) {
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
