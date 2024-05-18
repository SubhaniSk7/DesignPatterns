package behavioral.mediator;

public interface ChatMediator {
    void notify(User user, String message);

    void addUser(User user);
}
