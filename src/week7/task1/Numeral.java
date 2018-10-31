package week7.task1;

public class Numeral extends Expression {
    private int value;

    //Constructor
    public Numeral() {

    }

    public Numeral(int value) {
        this.value = value;
    }

    //setter, getter
    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    //ghi đè phương thức toString() ở class EXpression

    @Override
    public String toString() {
        return Integer.toString(value);
    }
    //ghi đè phương thức evaluate() ở class EXpression

    @Override
    public int evaluate() {
        return getValue();
    }
}
