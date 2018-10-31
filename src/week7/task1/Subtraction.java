package week7.task1;

public class Subtraction extends BinaryExpression {
    private Expression left;
    private Expression right;

    //Contructor
    public Subtraction() {

    }

    public Subtraction(Expression ex1, Expression ex2) {
        this.left = ex1;
        this.right = ex2;
    }

    //setter, getter
    public void setExpression(Expression ex1, Expression ex2) {
        this.left = ex1;
        this.right = ex2;
    }

    public void setLeft(Expression ex1) {
        this.left = ex1;
    }

    public void setRight(Expression ex2) {
        this.right = ex2;
    }

    public Expression getRight() {
        return right;
    }

    public Expression getLeft() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public String toString() {
        return left.toString() + "-" + right.toString();
    }

    @Override
    public int evaluate() {
        return left().evaluate() - right().evaluate();
    }
}
