import java.util.Scanner;

public class AreaOfHexagon {

	public AreaOfHexagon() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a = (float) 2.59807621135;
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter the Side of Hexagon");
		int input=obj.nextInt();
		float area = a*(input*input);
		System.out.println("area of Hexagon is:"+area);

	}

}
