package behavioral.command;

// Concrete command. It knows concrete receiver and knows which method to call and parameters to pass.
public class ChangeChannelCommand implements Command {

    TV tv;

    public ChangeChannelCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.changeChannel();
    }
}
