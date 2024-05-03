package creational.factory;

public class ShapeFactory {
    Shape shape;

    public Shape getShape(String shapeName) {
        if (shapeName.equals("Rectangle")) {
            shape = new Rectangle();
        } else {
            shape = new Circle();
        }
        return shape;
    }
}
