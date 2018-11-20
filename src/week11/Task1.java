package week11;

import java.util.Arrays;

/**
 * chương trình sắp xếp cho các kiểu dữ liệu(trừ boolean);
 */
public class Task1 {
    static <T> void SortArr(T[] a){
        Arrays.sort(a);
    }

    public static void main(String[] args) {
        String[] a = {"f", "e", "c", "d", "a","b"};
        SortArr(a);
        System.out.println("Result: " + Arrays.toString(a));
    }
}
