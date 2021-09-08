import java.util.Scanner;

public class ReverseWord {
	
	void reverse(String s)
	{
		String[] words = s.split(" ");
		String reversedString = "";
		for (int i = 0; i < words.length; i++)
	    {
	           String word = words[i]; 
	           String rWord = "";
	           for (int j = word.length()-1; j >= 0; j--) 
	           {
	        	   rWord = rWord + word.charAt(j);
	           }
		   reversedString = reversedString + rWord + " ";
		}
		System.out.println(s);
		System.out.println(reversedString);
	}
	public static void main(String[] args) {
		ReverseWord obj = new ReverseWord();
		obj.reverse("this is santhosh");
		
	}

}
