
import java.util.Scanner;
public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
		a = Math.abs(a);
		b = Math.abs(b);
		if( a == 0 && b != 0) return b;
		else if( a != 0 && b == 0) return b;
		else{
			while(a != b)
			{
				if(a > b) a = a - b;
				else b = b - a;
			}
			return a;
		}
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
		if(n == 0) return 0;
		if( n == 1) return 1;
		else return fibonacci(n -1) + fibonacci(n - 2);
    }
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("A = ");
		int a = input.nextInt();
		System.out.print("B = ");
		int b = input.nextInt();
		Task1 result = new Task1();
		int c = result.gcd(a, b);
		System.out.print("GCD(A, B) = ");
		System.out.println(c);
		System.out.print("N = ");
		int n = input.nextInt(); //fibonacci
		Task1 result1 = new Task1();
		int x = result1.fibonacci(n);
		System.out.println(x);
	}
}
