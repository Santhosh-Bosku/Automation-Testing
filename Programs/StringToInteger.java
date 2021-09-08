import java.util.Scanner;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		String s = obj.next();
		try {
			int input = Integer.parseInt(s);
			System.out.println("this is integer"+input);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}

}
