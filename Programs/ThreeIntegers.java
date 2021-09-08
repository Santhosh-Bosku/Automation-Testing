import java.util.Scanner;

public class ThreeIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[3];
		System.out.println("Enter the numbers:");
		Scanner obj = new Scanner(System.in);
		for(int i =0 ;i <3;i++)
		{
			int input = obj.nextInt();
			input = input%10;
			a[i] = input;
		}
		int x = a[0];
		int y = a[1];
		int z = a[2];
		if((x == y) || (y==z) || (z==x))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("False");
		}
	}
}
