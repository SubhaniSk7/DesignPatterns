package behavioral.state;

public class OutOfStockState extends VendingMachineState {

    public OutOfStockState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public void insertCoin() {
        System.out.println("OutOfStockState: Out of stock.Coin ejected.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("OutOfStockState: No coin to eject.");
    }

    @Override
    public void selectItem() {
        System.out.println("OutOfStockState: Out of stock.");
    }

    @Override
    public void dispense() {
        System.out.println("OutOfStockState: Out of stock.");
    }
}
