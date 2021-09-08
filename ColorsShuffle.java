import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ColorsShuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> ary = new ArrayList<String>();
		ary.add("Yellow");
		ary.add("Green");
		ary.add("Red");
		ary.add("Blue");
		ary.add("Black");
		ary.add("White");
		
		for(int i =0 ; i<3; i++)
		{
			Collections.shuffle(ary);
			System.out.println(ary);
		}
	}

}
