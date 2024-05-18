package behavioral.interpreter;

public class ClientCodeInterpreterPattern {

    public void execute() {

        // Interpreter pattern provides a way to evaluate sentences in a language.
        // The pattern uses a set of classes to represent grammar rules and can be used to interpret expressions in a
        // given language. It's particularly useful for designing simple languages, grammars, or expressions,
        // such as mathematical expressions or scripting languages.

        // (2+2) - (5+7)
        Expression two = new Number(2);
        Expression five = new Number(5);
        Expression seven = new Number(7);

        Expression add1 = new AddExpression(two, two);
        Expression add2 = new AddExpression(five, seven);

        Expression sub = new SubtractExpression(add1, add2);

        int result = sub.interpret();
        System.out.println("Expression (2+2) - (5+7) result: " + result);
    }
}
