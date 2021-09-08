import java.util.Scanner;

public class exceptionHandling {

	public exceptionHandling() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[] = {0,1,2,3,4,5};
			System.out.println("Enter the value:");
			Scanner sObj = new Scanner(System.in);
			int b = sObj.nextInt();
			int d = 10/b;
			try {
				System.out.println("\n Enter the position");
				int c = sObj.nextInt();
				a[c] = d;
				System.out.println("the value is updated:" +a[c]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
		}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
		try {
			String text = null;
			System.out.println(+text.length());
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally {
			System.out.println("Exceptions completed!");
		}
		
	}
}
