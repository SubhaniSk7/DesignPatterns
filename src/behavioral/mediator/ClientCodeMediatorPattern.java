package behavioral.mediator;

// Client
public class ClientCodeMediatorPattern {

    public void execute() {
        // if required, we can add new mediator. as long as components talks to each other via mediator.
        ChatMediator mediator = new ChatRoom();

        User user1 = new ChatUser(mediator, "Tom");
        User user2 = new ChatUser(mediator, "Jerry");
        User user3 = new ChatUser(mediator, "Panther");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.sendMessage("hello world!");
    }
}
