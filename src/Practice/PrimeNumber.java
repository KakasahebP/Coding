package Practice;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int no=7;
		int count=0;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not prime number");
		}
	}

}
