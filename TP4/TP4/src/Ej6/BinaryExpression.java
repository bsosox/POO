package Ej6;

public class BinaryExpression extends Expression{
    protected Expression leftExpression, rightExpression;

    public abstract boolean evaluate();

    public BinaryExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }
}
