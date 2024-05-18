package behavioral.interpreter;

// Addition expression to interpret addition operation in mathematical expression.
// In Composite pattern, it is intermediate node.
public class AddExpression implements Expression {
    Expression leftExpression;
    Expression rightExpression;

    public AddExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() + rightExpression.interpret();
    }
}
