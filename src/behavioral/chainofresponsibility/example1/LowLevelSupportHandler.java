package behavioral.chainofresponsibility.example1;

public class LowLevelSupportHandler extends SupportHandler {

    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getLevel().equals("LOW")) {
            System.out.println("Low Level Support Handler, request description:" + request.getDescription());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
