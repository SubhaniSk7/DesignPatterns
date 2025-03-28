package creational.factory;

// Interface class.
// Created Static class to replace Factory class(In this approach, we don't create Factory class).
// All the calling classes depends on Interface, so, we can make implementations class as package scope i.e., not public.
// (If let say factory class resides in some other package, then we need to make implementation classes as public to access)
public interface Shape1 {

    static Shape1 of(String shapeName) {
        if (shapeName.equals("Rectangle")) {
            return new Rectangle1();
        }
        return new Circle1();
    }

    default void draw(String shapeName) {
        System.out.println("Shape: " + shapeName);
    }

    void print();
}
