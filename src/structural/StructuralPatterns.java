package structural;

import structural.adpater.AdapterClientCode;
import structural.bridge.BridgeClientCode;
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
        System.out.println();

        // Bridge Pattern
        System.out.println("-------------Bridge pattern-------------");
        BridgeClientCode bridgeClientCode = new BridgeClientCode();
        bridgeClientCode.execute();
        System.out.println();

        // Proxy pattern
        System.out.println("-------------Proxy pattern-------------");
        ProxyClientCode proxyClientCode = new ProxyClientCode();
        proxyClientCode.execute();
        System.out.println();

        // Facade pattern
        System.out.println("-------------Facade pattern-------------");
        FacadeClientCode facadeClientCode = new FacadeClientCode();
        facadeClientCode.execute();
        System.out.println();

        // Composite pattern
        System.out.println("-------------Composite pattern-------------");
        CompositeClientCode compositeClientCode = new CompositeClientCode();
        compositeClientCode.execute();
        System.out.println();

        // Decorator pattern
        System.out.println("-------------Decorator pattern-------------");
        DecoratorClientCode decoratorClientCode = new DecoratorClientCode();
        decoratorClientCode.execute();
        System.out.println();

        // Flyweight pattern
        System.out.println("-------------Flyweight pattern-------------");
        FlyweightClientCode flyweightClientCode = new FlyweightClientCode();
        flyweightClientCode.execute();
        System.out.println();
    }
}
