package week11;

import java.util.Arrays;

/**
 * chương trình tìm max của các kiểu dữ liệu(trừ boolean)
 */
public class Task2 {
    static <T> T MaxOfArr(T[] a){
        Arrays.sort(a);
        return a[a.length- 1];
    }
    public static void main(String[] args) {
        String[] a = {"f", "e", "c", "d", "a","b"};
        String max = MaxOfArr(a);
        System.out.println("Max: " + max);
    }
}
