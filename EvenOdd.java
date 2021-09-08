import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner obj =new Scanner(System.in);
		int num = obj.nextInt();
		if(num%2 == 0)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
	}
}
