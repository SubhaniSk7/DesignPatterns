package behavioral.visitor;

// Concrete visitor. It holds for all elements.
public class USATaxVisitor implements TaxVisitor {
    @Override
    public void visit(Book book) {
        System.out.println("Book tax price in USA: " + book.getPrice() * 0.15);
    }

    @Override
    public void visit(Food food) {
        System.out.println("Food tax price in USA: " + food.getPrice() * 0.20);
    }

    @Override
    public void visit(Electronics electronics) {
        System.out.println("Electronics tax price in USA: " + electronics.getPrice() * 0.3);
    }
}
