package behavioral.command;

// Concrete command. It knows concrete receiver and knows which method to call and parameters to pass.
public class AdjustVolumeCommand implements Command {

    Speaker speaker;

    public AdjustVolumeCommand(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public void execute() {
        speaker.adjustVolume();
    }
}
