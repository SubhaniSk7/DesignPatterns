package behavioral.chainofresponsibility.example1;

public class HighLevelSupportHandler extends SupportHandler {

    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getLevel().equals("HIGH")) {
            System.out.println("High Level Support Handler, request description:" + request.getDescription());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
