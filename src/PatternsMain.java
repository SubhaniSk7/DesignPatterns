import behavioral.strategypattern.AdditionConcreteStrategy;
import behavioral.strategypattern.CalculatorContext;
import behavioral.strategypattern.MultiplicationConcreteStrategy;
import behavioral.strategypattern.SubtractionConcreteStrategy;

public class PatternsMain {

    public static void main(String[] subhani) {

        System.out.println("----------------------------StrategyPattern----------------------------");
        strategyPattern();


    }

    public static void strategyPattern() {
        CalculatorContext calculatorContext = new CalculatorContext();

        AdditionConcreteStrategy additionConcreteStrategy = new AdditionConcreteStrategy();
        calculatorContext.setOperationStrategy(additionConcreteStrategy);
        System.out.println("Addition strategy:" + calculatorContext.executeStrategy(1, 2));

        SubtractionConcreteStrategy subtractionConcreteStrategy = new SubtractionConcreteStrategy();
        calculatorContext.setOperationStrategy(subtractionConcreteStrategy);
        System.out.println("Subtraction strategy:" + calculatorContext.executeStrategy(1, 2));

        MultiplicationConcreteStrategy multiplicationConcreteStrategy = new MultiplicationConcreteStrategy();
        calculatorContext.setOperationStrategy(multiplicationConcreteStrategy);
        System.out.println("Multiplication strategy:" + calculatorContext.executeStrategy(2, 3));
    }
}
