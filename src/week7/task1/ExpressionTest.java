package week7.task1;

public class ExpressionTest {
    public static void main(String[] args) {
        Numeral number1 = new Numeral();
        Numeral number2 = new Numeral();
        Numeral number3 = new Numeral();
        Numeral number4 = new Numeral();
        Numeral number5 = new Numeral();

        number1.setValue(1);
        number2.setValue(2);
        number3.setValue(3);
        number4.setValue(3);
        number5.setValue(10);

        //Khoi tao expressions
        Square square1 = new Square();
        Square square2 = new Square();
        Subtraction sub = new Subtraction();
        Multiplication mul = new Multiplication();
        Addition add = new Addition();

        //Tinh giá trị biểu thức
        System.out.println("Gia tri bieu thuc can tinh la: ");
        square1.setExpression(number5);
        sub.setExpression(square1, number1);
        mul.setExpression(number2, number3);
        add.setExpression(sub, mul);
        square2.setExpression(add);
        System.out.println(square2.toString() + "=" + square2.evaluate());

        Numeral number110 = new Numeral();
        Numeral number0 = new Numeral();
        number110.setValue(10);
        number0.setValue(0);
        Division division = new Division();
        division.setExpression(number110, number0);
        try {
            division.evaluate();
        } catch (ArithmeticException ex) {
            System.out.println(ex);
        }
    }
}
