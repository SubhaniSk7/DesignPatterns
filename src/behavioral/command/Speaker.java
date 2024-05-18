package behavioral.command;

// Receiver
public class Speaker implements Device {
    @Override
    public void turnOn() {
        System.out.println("Speaker: turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Speaker: turned off.");
    }

    public void adjustVolume() {
        System.out.println("Speaker: volume adjusted.");
    }
}
