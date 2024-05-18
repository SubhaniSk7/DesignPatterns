package behavioral.mediator;

// Concrete component.
public class ChatUser extends User {

    public ChatUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(this.name + " sending message: " + message);
        mediator.notify(this, message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(this.name + " received message: " + message);
    }
}
