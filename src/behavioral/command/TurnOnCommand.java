package behavioral.command;

// Concrete command. It knows concrete receiver and knows which method to call and parameters to pass.
public class TurnOnCommand implements Command {
    Device device;

    public TurnOnCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
