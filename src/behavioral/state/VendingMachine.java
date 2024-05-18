package behavioral.state;

public class VendingMachine {
    VendingMachineState state;
    int itemCount;

    public VendingMachine(int itemCount) {
        this.itemCount = itemCount;
        state = new NoCoinState(this);
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void insertCoin() {
        state.insertCoin();
    }

    public void ejectCoin() {
        state.ejectCoin();
    }

    public void selectItem() {
        state.selectItem();
    }

    public void dispense() {
        state.dispense();
    }

    public int getItemCount() {
        return itemCount;
    }

    public void releaseItem() {
        if (itemCount > 0) {
            itemCount--;
            System.out.println("Item dispensed. Remaining items: " + itemCount);
        }
    }
}
