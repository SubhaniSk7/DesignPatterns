package creational;

import creational.abstractfactory.*;
import creational.builder.BuilderPatternMain;
import creational.factory.Shape;
import creational.factory.ShapeFactory;
import creational.objectpool.ConnectionPool;
import creational.objectpool.DBConnection;
import creational.prototype.TechnologyCollege;
import creational.singleton.SingletonClass;
import creational.singleton.SingletonEnum;

public class CreationalPatterns {

    public void patterns() {
        // Singleton pattern
        System.out.println("-------------Singleton pattern-------------");
        SingletonClass singletonClass = SingletonClass.getInstance();
        singletonClass.print();

        //
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        singletonEnum.print();

        // Builder pattern
        System.out.println("-------------Builder pattern-------------");
        BuilderPatternMain builderPatternMain = new BuilderPatternMain();
        builderPatternMain.print();

        // Factory pattern
        // Here one factory class only creates objects related to one type, without specifying their concrete classes.
        System.out.println("-------------Factory pattern-------------");
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("Rectangle");
        shape.print();

        shape = shapeFactory.getShape("Circle");
        shape.print();

        // Abstract Factory pattern
        // Here one factory class creates objects related to a family of related or dependent classes,
        // without specifying their concrete classes.
        // here factory type needs to be selected by client.
        System.out.println("-------------Abstract Factory pattern-------------");
        FurnitureFactory furnitureFactory = new OldStyleFurnitureFactory();
        Chair chair = furnitureFactory.createChair();
        Sofa sofa = furnitureFactory.createSofa();
        chair.chairType();
        sofa.sofaType();

        furnitureFactory = new ModernStyleFurnitureFactory();
        chair = furnitureFactory.createChair();
        sofa = furnitureFactory.createSofa();
        chair.chairType();
        sofa.sofaType();

        // getting correct factory based on type.
        AbstractFurnitureFactory factory = new AbstractFurnitureFactory();
        furnitureFactory = factory.getFurnitureFactory("Old");
        chair = furnitureFactory.createChair();
        sofa = furnitureFactory.createSofa();
        chair.chairType();
        sofa.sofaType();

        // Prototype pattern
        System.out.println("-------------Prototype pattern-------------");
        TechnologyCollege technologyCollege = new TechnologyCollege();
        technologyCollege.location = "Bangalore";
        technologyCollege.id = 1;
        technologyCollege.rank = 1;
        technologyCollege.print();

        TechnologyCollege anotherTechnologyCollege = (TechnologyCollege) technologyCollege.cloneObject();
        anotherTechnologyCollege.print();

        // Object Pool pattern
        System.out.println("-------------Object Pool pattern-------------");
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        DBConnection connection1 = connectionPool.getConnection();
        connection1.print();
        DBConnection connection2 = connectionPool.getConnection();
        connection2.print();
        DBConnection connection3 = connectionPool.getConnection();
        connection3.print();
        connectionPool.releaseConnection(connection3);
        connectionPool.releaseConnection(connection1);
        connectionPool.releaseConnection(connection2);
    }
}
