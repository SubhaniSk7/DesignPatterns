package behavioral.interpreter;

// Subtraction expression to interpret subtraction operation in mathematical expression.
// In Composite pattern, it is intermediate node.
public class SubtractExpression implements Expression {
    Expression leftExpression;
    Expression rightExpression;

    public SubtractExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() - rightExpression.interpret();
    }
}
