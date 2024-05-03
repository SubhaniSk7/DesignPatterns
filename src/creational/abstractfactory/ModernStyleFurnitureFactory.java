package creational.abstractfactory;

// This factory only creates one family type of objects - Modern style family type.
public class ModernStyleFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernStyleChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernStyleSofa();
    }
}
