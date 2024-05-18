package behavioral.state;

public class NoCoinState extends VendingMachineState {

    public NoCoinState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public void insertCoin() {
        System.out.println("NoCoinState: Coin inserted.");

        // Instead of creating new state instance, we can reuse object instance,
        // if we create these state object as part of Context and get it from context class
        // like vendingMachine.getHasCoinState()
        vendingMachine.setState(new HasCoinState(vendingMachine));
    }

    @Override
    public void ejectCoin() {
        System.out.println("NoCoinState: No coin to eject.");
    }

    @Override
    public void selectItem() {
        System.out.println("NoCoinState: Insert coin first.");
    }

    @Override
    public void dispense() {
        System.out.println("NoCoinState: Insert coin first.");
    }
}
