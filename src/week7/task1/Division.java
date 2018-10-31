package week7.task1;

public class Division extends BinaryExpression {
    private Expression left;
    private Expression right;

    //Constructor
    public Division() {

    }

    public Division(Expression exp1, Expression exp2) {
        this.left = exp1;
        this.right = exp2;
    }

    //settet, getter
    public Expression getRight() {
        return right;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public void setExpression(Expression exp1, Expression exp2) {
        this.left = exp1;
        this.right = exp2;
    }


    @Override
    public int evaluate() throws ArithmeticException {
        if (right.evaluate() == 0) {
            System.out.println("Lỗi chia cho 0");
        }
        return left().evaluate() / right().evaluate();
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
        return left.toString() + "/" + right.toString();
    }
}
