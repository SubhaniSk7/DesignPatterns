package behavioral.chainofresponsibility.example1;

public class MidLevelSupportHandler extends SupportHandler {

    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getLevel().equals("MID")) {
            System.out.println("Mid Level Support Handler, request description:" + request.getDescription());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
