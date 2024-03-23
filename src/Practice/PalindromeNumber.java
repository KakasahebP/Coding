package Practice;

public class PalindromeNumber {
	public static void main(String[] args) {
		
		int no=234321;
		int rem;
		int orinNo=no;
		int rev=0;
		while(no>0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		if(orinNo==rev)
		{
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("Not palindrome");
		}
		
		//count number of digit
		int no1=12345;
		int count=0;
		while(no1>0)
		{
			no1=no1/10;
			count++;
		}
		System.out.println(count);
	}

}
