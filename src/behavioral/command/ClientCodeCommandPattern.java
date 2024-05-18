package behavioral.command;

// Client
public class ClientCodeCommandPattern {

    public void execute() {

//        Receivers
        TV tv = new TV();
        Speaker speaker = new Speaker();

//        Commands
        Command turnOnCommand = new TurnOnCommand(tv);
        Command turnOffCommand = new TurnOffCommand(tv);
        Command changeChannelCommand = new ChangeChannelCommand(tv);
        Command adjustVolumeCommand = new AdjustVolumeCommand(speaker);

//        Invoker
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(turnOnCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOffCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(changeChannelCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(adjustVolumeCommand);
        remoteControl.pressButton();
    }
}
