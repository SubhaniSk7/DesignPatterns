package creational.abstractfactory;

// This factory only creates one family type of objects - Old style family type.
public class OldStyleFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new OldStyleChair();
    }

    @Override
    public Sofa createSofa() {
        return new OldStyleSofa();
    }
}
