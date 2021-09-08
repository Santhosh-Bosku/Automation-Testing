import java.util.Scanner;

public class ReverseOfString {

	public ReverseOfString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String:");
		Scanner obj = new Scanner(System.in);
		String a = obj.next();
		char[] input1 = a.toCharArray();
		 
        for (int i = input1.length - 1; i >= 0; i--)
        {
            System.out.print(input1[i]);
    	}
		
	}

}
