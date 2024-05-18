package behavioral;

import behavioral.chainofresponsibility.ClientCodeChainOfResponsibility;
import behavioral.command.ClientCodeCommandPattern;
import behavioral.interpreter.ClientCodeInterpreterPattern;
import behavioral.iterator.ClientCodeIterator;
import behavioral.mediator.ClientCodeMediatorPattern;
import behavioral.memento.ClientCodeMementoPattern;
import behavioral.observer.ClientCodeObserverPattern;
import behavioral.state.ClientCodeStatePattern;
import behavioral.strategy.ClientCodeStrategyPattern;
import behavioral.templatemethod.ClientCodeTemplateMethodPattern;
import behavioral.visitor.ClientCodeVisitorPattern;

public class BehavioralPatterns {
    public void patterns() {
        // Chain of Responsibility pattern
        System.out.println("-------------Chain of Responsibility pattern-------------");
        ClientCodeChainOfResponsibility clientCodeChainOfResponsibility = new ClientCodeChainOfResponsibility();
        clientCodeChainOfResponsibility.execute();
        System.out.println();

        // Command pattern
        System.out.println("-------------Command pattern-------------");
        ClientCodeCommandPattern clientCodeCommandPattern = new ClientCodeCommandPattern();
        clientCodeCommandPattern.execute();
        System.out.println();

        // Iterator pattern
        System.out.println("-------------Iterator pattern-------------");
        ClientCodeIterator clientCodeIterator = new ClientCodeIterator();
        clientCodeIterator.execute();
        System.out.println();

        // Mediator pattern
        System.out.println("-------------Mediator pattern-------------");
        ClientCodeMediatorPattern clientCodeMediatorPattern = new ClientCodeMediatorPattern();
        clientCodeMediatorPattern.execute();
        System.out.println();

        // Memento pattern
        System.out.println("-------------Memento pattern-------------");
        ClientCodeMementoPattern clientCodeMementoPattern = new ClientCodeMementoPattern();
        clientCodeMementoPattern.execute();
        System.out.println();

        // Observer pattern
        System.out.println("-------------Observer pattern-------------");
        ClientCodeObserverPattern clientCodeObserverPattern = new ClientCodeObserverPattern();
        clientCodeObserverPattern.execute();
        System.out.println();

        // State pattern
        System.out.println("-------------State pattern-------------");
        ClientCodeStatePattern clientCodeStatePattern = new ClientCodeStatePattern();
        clientCodeStatePattern.execute();
        System.out.println();

        // Strategy pattern
        System.out.println("-------------Strategy pattern-------------");
        ClientCodeStrategyPattern clientCodeStrategyPattern = new ClientCodeStrategyPattern();
        clientCodeStrategyPattern.execute();
        System.out.println();

        // Template Method pattern
        System.out.println("-------------Template pattern-------------");
        ClientCodeTemplateMethodPattern clientCodeTemplateMethodPattern = new ClientCodeTemplateMethodPattern();
        clientCodeTemplateMethodPattern.execute();
        System.out.println();

        // Visitor pattern
        System.out.println("-------------Visitor pattern-------------");
        ClientCodeVisitorPattern clientCodeVisitorPattern = new ClientCodeVisitorPattern();
        clientCodeVisitorPattern.execute();
        System.out.println();

        // Interpreter pattern
        System.out.println("-------------Interpreter pattern-------------");
        ClientCodeInterpreterPattern clientCodeInterpreterPattern = new ClientCodeInterpreterPattern();
        clientCodeInterpreterPattern.execute();

    }
}
