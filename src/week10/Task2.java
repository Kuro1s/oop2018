package week10;

import java.util.Scanner;

public class Task2 {
    /**
     * Thuận toán sắp xếp Bubble Sort
     * @param a là mảng cần sắp xếp
     * @return một mảng sap khi sắp xếp thep Bubble Sort
     */
    public double[] BubbleSort(double a[])
    {
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a.length - i - 1; j++)
            {
                if(a[j] > a[j+1])
                {
                    double temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int N = input.nextInt();
        double[] a = new double[N];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = input.nextDouble();
        }
        Task2 b = new Task2();
        b.BubbleSort(a);
        for(double st:a)
        {
            System.out.println(st);
        }
    }
}
