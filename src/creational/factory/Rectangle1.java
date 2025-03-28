package creational.factory;

// Implementation class for Shape1, but is in Package scope.
class Rectangle1 implements Shape1 {

    @Override
    public void print() {
        draw("Rectangle");
    }
}
