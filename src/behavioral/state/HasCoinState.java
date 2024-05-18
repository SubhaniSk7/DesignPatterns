package behavioral.state;

public class HasCoinState extends VendingMachineState {

    public HasCoinState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public void insertCoin() {
        System.out.println("HasCoinState: Coin already inserted.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("HasCoinState: Coin ejected.");

        // Instead of creating new state instance, we can reuse object instance,
        // if we create these state object as part of Context and get it from context class
        // like vendingMachine.getNoCoinState()
        vendingMachine.setState(new NoCoinState(vendingMachine));
    }

    @Override
    public void selectItem() {
        System.out.println("HasCoinState: Item selected.");
        if (vendingMachine.itemCount > 0) {
            vendingMachine.setState(new DispensedState(vendingMachine));
        } else {
            vendingMachine.setState(new OutOfStockState(vendingMachine));
        }
    }

    @Override
    public void dispense() {
        System.out.println("HasCoinState: select item first.");
    }
}
