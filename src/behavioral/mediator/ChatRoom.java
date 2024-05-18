package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

// Concrete mediator
public class ChatRoom implements ChatMediator {
    private final List<User> userList;

    public ChatRoom() {
        this.userList = new ArrayList<>();
    }

    @Override
    public void notify(User user, String message) {
        for (User u : userList) {
            if (u != user) {
                u.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.userList.add(user);
    }
}
