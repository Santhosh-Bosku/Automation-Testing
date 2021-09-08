import java.util.Scanner;

public class DivideBy {
public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	int number = obj.nextInt();
	if (number%3 == 0 & number%5 == 0)
	{
		System.out.println("the "+number+" is divide by 3 and 5");
	}
	else
	{
		System.out.println("not divisible");
	}
}
}
