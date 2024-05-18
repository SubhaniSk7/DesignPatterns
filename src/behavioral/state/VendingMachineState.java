package behavioral.state;

// This is State. It can be abstract class and can have field reference to Context object or pass Context object as parameter to these methods.
// It can have common code fields/methods.

// It can be an interface as well, then we can pass Context object as parameter.
public abstract class VendingMachineState {
    protected VendingMachine vendingMachine;

    public VendingMachineState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public abstract void insertCoin();

    public abstract void ejectCoin();

    public abstract void selectItem();

    public abstract void dispense();
}
