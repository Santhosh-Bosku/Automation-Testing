import java.util.ArrayList;

public class ColorsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ary = new ArrayList<String>();
		
		boolean flag = ary.isEmpty();
		
		if (flag == false) {
			System.out.println("the array is not Empty");
		} else {
			System.out.println("the array is empty");
		}
		
		ary.add("Yellow");
		ary.add("Green");
		ary.add("Red");
		ary.add("Blue");
		ary.add("Black");
		ary.add("White");
		
		flag = ary.isEmpty();
		
		if (flag == false) {
			System.out.println("the array is not Empty");
		} else {
			System.out.println("the array is empty");
		}
		
	}

}
