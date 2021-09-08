import java.util.Scanner;

public class Minutes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Seconds");
		Scanner obj = new Scanner(System.in);
		int sec = obj.nextInt();
		int min = 00;
		int hr= 00;
		if (sec>59)
		{
			min = sec/60;
			sec = sec%60;
			if (min>59) {
				hr = min/60;
				min = min%60;
			}
		}
		System.out.println(hr+"hr:"+min+"min:"+sec+"sec");
	}

}
