package creational.factory;

public abstract class Shape {

    void draw(String shapeName) {
        System.out.println("Shape: " + shapeName);
    }

    public abstract void print();
}
