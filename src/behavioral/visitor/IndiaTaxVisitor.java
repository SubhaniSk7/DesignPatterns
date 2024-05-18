package behavioral.visitor;

// Concrete visitor. It holds for all elements.
public class IndiaTaxVisitor implements TaxVisitor {
    @Override
    public void visit(Book book) {
        System.out.println("Book tax price in India: " + book.getPrice() * 0.1);
    }

    @Override
    public void visit(Food food) {
        System.out.println("Food tax price in India: " + food.getPrice() * 0.15);
    }

    @Override
    public void visit(Electronics electronics) {
        System.out.println("Electronics tax price in India: " + electronics.getPrice() * 0.2);
    }
}
