import java.util.ArrayList;
import java.util.Iterator;

public class ColorsUpdate {

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
		
		ary.set(2, "Changed Red");
		
		System.out.println("\nAfter Update :\n");
		
		Iterator<String> itr2 = ary.iterator();
		
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}

	}

}
