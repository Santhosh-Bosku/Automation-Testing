
public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The Odd Number are :");
		int count = 0;
		for(int i = 1; i<100;i++)
		{
			if(i%2 != 0)
			{
				System.out.println(+i);
				count = count+1;				
			}
		}
		System.out.println("Total Number of Odd Nubmes are: "+count);

	}

}
