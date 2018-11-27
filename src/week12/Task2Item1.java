package week12;

/**
 * Mẫu Strategy:
 *
 * Ta định nghĩa sẵn các đối tượng, các thuật toán, các hàm…
 *
 * Mẫu strategy cho phép người sử dụng các “chiến lược” có sẵn vào những vấn đề cụ thể… Ngoài ra còn cho phép người dùng dễ dàng thêm vào một “chiến lược” mới.
 *
 * Các “chiến lược” được tách biệt ra khỏi chương trình. Người dùng chỉ cần biết cách sử dụng chúng, không cần biết chúng thực hiện như thế nào!
 */
public abstract class Task2Item1 {
    public void BubbleSort(int a[])
    {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    public  void  SelectionSort(int a[])
    {
        for(int i = 0; i < a.length; i++)
            for(int j = 0; j < i; j++)
            {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
    }
}
