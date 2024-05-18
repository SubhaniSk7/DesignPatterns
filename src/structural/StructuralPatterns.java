package structural;

import structural.adpater.AdapterClientCode;
import structural.composite.CompositeClientCode;
import structural.decorator.DecoratorClientCode;
import structural.facade.FacadeClientCode;
import structural.flyweight.FlyweightClientCode;
import structural.proxy.ProxyClientCode;

public class StructuralPatterns {
    public void patterns() {
        // Adapter pattern
        System.out.println("-------------Adapter pattern-------------");
        AdapterClientCode adapterClientCode = new AdapterClientCode();
        adapterClientCode.execute();

        // Composite pattern
        System.out.println("-------------Composite pattern-------------");
        CompositeClientCode compositeClientCode = new CompositeClientCode();
        compositeClientCode.execute();

        // Decorator pattern
        System.out.println("-------------Decorator pattern-------------");
        DecoratorClientCode decoratorClientCode = new DecoratorClientCode();
        decoratorClientCode.execute();

        // Facade pattern
        System.out.println("-------------Facade pattern-------------");
        FacadeClientCode facadeClientCode = new FacadeClientCode();
        facadeClientCode.execute();

        // Flyweight pattern
        System.out.println("-------------Flyweight pattern-------------");
        FlyweightClientCode flyweightClientCode = new FlyweightClientCode();
        flyweightClientCode.execute();

        // Proxy pattern
        System.out.println("-------------Proxy pattern-------------");
        ProxyClientCode proxyClientCode = new ProxyClientCode();
        proxyClientCode.execute();
    }
}
