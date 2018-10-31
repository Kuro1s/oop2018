package week7.task2;

/**
 *  lỗi ArrayIndexOfBoundEx
 */
public class ArrayIndexOfBoundEx {
    int[] arr = {0};

    public static void main(String[] args) {
        ArrayIndexOfBoundEx arrayIndexOfBoundEx = new ArrayIndexOfBoundEx();
        try {
            arrayIndexOfBoundEx.throwEx(2);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex);
        }
    }

    public void throwEx(int position) throws ArrayIndexOutOfBoundsException {
        int i = arr[position];
    }

}
