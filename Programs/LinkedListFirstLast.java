import java.util.LinkedList;

public class LinkedListFirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l = new LinkedList<String>();
		
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		
		l.addFirst("First");
		l.addLast("last");
		
		System.out.println(l);

	}

}
