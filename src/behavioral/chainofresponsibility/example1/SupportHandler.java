package behavioral.chainofresponsibility.example1;

// This is acts as Handler interface and base handler.
public abstract class SupportHandler {
    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(SupportRequest request);
}
