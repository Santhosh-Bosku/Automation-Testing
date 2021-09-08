import java.util.Scanner;

public class SumOfDigitsOfInteger {

//	public SumOfDigitsOfInteger() {
//		// TODO Auto-generated constructor stub
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj =new Scanner(System.in);
		System.out.println("Entet the Integer");
		int num = obj.nextInt();
		int sum = 0;
		while(num>0)
		{
			sum = sum + (num % 10);
			num = num / 10;
		}
		
		System.out.println(+sum);

	}

}
