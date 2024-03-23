package snippet;

public class ReverseNumber {
	public static void main(String[] args) {

		int a = 12345;
		int rev = 0, rem;
		int orignalno = a;
//		while(a>0)
//		{
//			rem=a%10;
//			rev=rev*10+rem;
//			a=a/10;
//		}

		while (a != 0) {
			rev = rev * 10 + a % 10;
			a = a / 10;
		}
		System.out.println("Reverse no is: " + rev);
		
		//2nd way
		System.out.println("============");
		long num=12345;
		System.out.println(new StringBuffer(String.valueOf(num)).reverse());
	}

}
