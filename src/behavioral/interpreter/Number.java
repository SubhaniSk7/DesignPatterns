package behavioral.interpreter;

// Terminal expression. Number is the terminal expression for Mathematical expression.
// In Composite pattern, it is leaf node.
public class Number implements Expression {
    int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}
