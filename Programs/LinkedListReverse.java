import java.util.Collections;
import java.util.LinkedList;

public class LinkedListReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> l = new LinkedList<String>();
		
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		
		Collections.reverse(l);
		
		System.out.println(l);

	}

}
