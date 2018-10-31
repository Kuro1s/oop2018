package week7.task1;

public class Multiplication extends BinaryExpression {
    private Expression left;
    private Expression right;

    //Constructor
    public Multiplication() {

    }

    public Multiplication(Expression ex1, Expression ex2) {
        this.left = ex1;
        this.right = ex2;
    }

    //settet, getter
    public void setExpression(Expression exp1, Expression exp2) {
        this.left = exp1;
        this.right = exp2;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    public void setLeft(Expression ex1) {
        this.left = ex1;
    }

    public void setRight(Expression ex2) {
        this.right = ex2;
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public String toString() {
        return left.toString() + "*" + right.toString();
    }

    @Override
    public int evaluate() {
        return left().evaluate() * right().evaluate();
    }
}
