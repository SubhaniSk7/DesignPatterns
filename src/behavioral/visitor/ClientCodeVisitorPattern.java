package behavioral.visitor;

public class ClientCodeVisitorPattern {

    public void execute() {
        ItemElement[] items = new ItemElement[]{new Book(10), new Food(100), new Electronics(1000)};

        TaxVisitor indiaTaxVisitor = new IndiaTaxVisitor();

        for (ItemElement item : items) {
            item.accept(indiaTaxVisitor);
        }

        TaxVisitor usaTaxVisitor = new USATaxVisitor();
        for (ItemElement item : items) {
            item.accept(usaTaxVisitor);
        }
    }
}
