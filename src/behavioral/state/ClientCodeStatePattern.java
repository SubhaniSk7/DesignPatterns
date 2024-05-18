package behavioral.state;

public class ClientCodeStatePattern {

    public void execute() {
        VendingMachine vendingMachine = new VendingMachine(3);

        // first item.
        vendingMachine.insertCoin();
        vendingMachine.selectItem();
        vendingMachine.dispense();

        vendingMachine.insertCoin();
        vendingMachine.ejectCoin();

        // second item.
        vendingMachine.insertCoin();
        vendingMachine.selectItem();
        vendingMachine.dispense();

        // third item.
        vendingMachine.insertCoin();
        vendingMachine.selectItem();
        vendingMachine.dispense();

        // fourth attempt, but out of stock.
        vendingMachine.insertCoin();
    }
}
