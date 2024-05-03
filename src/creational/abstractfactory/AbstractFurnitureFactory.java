package creational.abstractfactory;

public class AbstractFurnitureFactory {

    public FurnitureFactory getFurnitureFactory(String type) {
        if (type.equals("Old")) {
            return new OldStyleFurnitureFactory();
        } else {
            return new ModernStyleFurnitureFactory();
        }
    }
}
