import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ColorsReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ary = new ArrayList<String>();
		ary.add("Yellow");
		ary.add("Green");
		ary.add("Red");
		ary.add("Blue");
		ary.add("Black");
		ary.add("White");
		
		Iterator<String> itr = ary.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("\nReversed ArrayList:\n");
		
		ArrayList<String> revAry = new ArrayList<String>();
		
		for(int i = ary.size() -1; i>=0;i--)
		{
			revAry.add(ary.get(i));
		}
		
		Iterator<String> itr2 = revAry.iterator();
		
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
		Collections.reverse(ary);
		System.out.println(ary);
	}

}
