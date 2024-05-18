package behavioral.chainofresponsibility;

import behavioral.chainofresponsibility.example1.HighLevelSupportHandler;
import behavioral.chainofresponsibility.example1.LowLevelSupportHandler;
import behavioral.chainofresponsibility.example1.MidLevelSupportHandler;
import behavioral.chainofresponsibility.example1.SupportHandler;
import behavioral.chainofresponsibility.example1.SupportRequest;

public class ClientCodeChainOfResponsibility {
    public void execute() {
        SupportHandler lowLevelSupportHandler = new LowLevelSupportHandler();
        SupportHandler midLevelSupportHandler = new MidLevelSupportHandler();
        SupportHandler highLevelSupportHandler = new HighLevelSupportHandler();

        // we don't always need to start from LowLevelSupportHandler.
        lowLevelSupportHandler.setNextHandler(midLevelSupportHandler);
        midLevelSupportHandler.setNextHandler(highLevelSupportHandler);

        SupportRequest request1 = new SupportRequest("LOW", "Request:1 Low level request");
        SupportRequest request2 = new SupportRequest("MID", "Request:2 Mid level request");
        SupportRequest request3 = new SupportRequest("HIGH", "Request:3 High level request");

        lowLevelSupportHandler.handleRequest(request1);
        lowLevelSupportHandler.handleRequest(request2);
        lowLevelSupportHandler.handleRequest(request3);
    }
}
