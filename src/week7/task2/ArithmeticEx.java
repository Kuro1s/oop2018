package week7.task2;

/**
 * bắt lỗi ArithmeticException
 */
public class ArithmeticEx {
    public static void main(String[] args) {
        ArithmeticEx arithmeticEx = new ArithmeticEx();
        try{
            arithmeticEx.throwEx();
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }
    public void throwEx() throws ArithmeticException {
        int i = 120/0;
    }
}
