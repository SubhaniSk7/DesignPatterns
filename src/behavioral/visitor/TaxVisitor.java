package behavioral.visitor;

// Visitor interface. It has visit method for all element objects. This way, it is more extensible for new visitors.
// for any new use-case, we can add new concrete visitor.
public interface TaxVisitor {
    void visit(Book book);

    void visit(Food food);

    void visit(Electronics electornics);
}
