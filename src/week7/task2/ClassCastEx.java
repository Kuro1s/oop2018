package week7.task2;

/**
 * lỗi ClassCastException
 */
public class ClassCastEx {
    public static void main(String[] args) {
        ClassCastEx classCastEx = new ClassCastEx();
        try {
            classCastEx.throwEx("asd");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }

    }

    private void throwEx(Object object) throws ClassCastException {
        int num = (int)object;
    }
}
