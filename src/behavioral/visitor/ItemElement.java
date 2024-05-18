package behavioral.visitor;

// Element interface
// It has an accept method, which takes visitor interface as parameter.
// All concrete classes need to implement this method.
public interface ItemElement {
    void accept(TaxVisitor visitor);
}
