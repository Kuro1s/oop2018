package week10;

import java.util.Scanner;

public class Task2 {
    /**
     * phương thức sinh số thực ngẫu nhiên
     * @return  một mảng số thực 1000 phần tử
     */
    public double[] inputArray() {
        double[] ramdom = new double[1000];
        for (int i = 0; i < 1000; i++) {
            ramdom[i] = Math.random() * 1000 ;
        }
        return ramdom;
    }

    /**
     * Thuận toán sắp xếp Bubble Sort
     *
     * @param a là mảng cần sắp xếp
     * @return một mảng sap khi sắp xếp thep Bubble Sort
     */
    public double[] BubbleSort(double a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    double temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Task2 b = new Task2();
        double[] a = b.inputArray();
        b.BubbleSort(a);
        for (double st : a) {
            System.out.println(st);
        }
    }
}
