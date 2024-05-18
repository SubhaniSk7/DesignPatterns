package behavioral.state;

public class DispensedState extends VendingMachineState {

    public DispensedState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public void insertCoin() {
        System.out.println("Dispensed state: Please wait, dispensing item.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Dispensed state: Coin already used.");
    }

    @Override
    public void selectItem() {
        System.out.println("Dispensed state: Item already dispensed.");
    }

    @Override
    public void dispense() {
        System.out.println("Dispensed state:");
        vendingMachine.releaseItem();
        if (vendingMachine.getItemCount() > 0) {
            vendingMachine.setState(new NoCoinState(vendingMachine));
        } else {
            vendingMachine.setState(new OutOfStockState(vendingMachine));
        }
    }
}
