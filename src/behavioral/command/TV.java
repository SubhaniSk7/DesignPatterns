package behavioral.command;

// Receiver
public class TV implements Device {
    @Override
    public void turnOn() {
        System.out.println("TV: turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV: turned off.");
    }

    public void changeChannel() {
        System.out.println("TV: channel changed.");
    }
}
