package structural.bridge;

public class BridgeClientCode {
    public void execute() {
        Color color = new RedColor();
        Shape shape = new Rectangle(color);
        shape.draw();

        color = new BlueColor();
        shape = new Circle(color);
        shape.draw();

    }
}
