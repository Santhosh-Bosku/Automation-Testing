import java.util.LinkedList;

public class LinkedListAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> l = new LinkedList<String>();
		
		l.add("a");
		l.add("b");
		l.add("c");
		
		l.addLast(l.get(1));
		
		System.out.println(l);

	}

}
