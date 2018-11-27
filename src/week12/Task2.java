package week12;

/**
 * task 2 week12
 */
public class Task2 extends  Task2Item1{
    //TODO: hàm thực thi task2
    public static void main(String[] args) {
        int a[] = {9,7,6,5,4,3,2,1};
        int b[] = {123,213,3,2,34,65,12};
        Task2 task = new Task2();
        System.out.println("BubbleSort: ");
        task.BubbleSort(a);
        for (int st : a)
        {
            System.out.print(st+" ");
        }
        System.out.println("SelectionSort: ");
        task.SelectionSort(b);
        for (int st : b)
        {
            System.out.print(st+" ");
        }
    }
}
