package snippet;

public class ReverseString {

	public static void main(String[] args) {

		// 1. Write a program to reverse a string in Java.
		String s = "Hello World";
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse().toString());
		System.out.println("================");
		// 2. using StringBuffer
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());

		// 3. another way
		System.out.println("================");
		String s1 = "Myjava";
		char[] strArray = s1.toCharArray();
		for (int i = strArray.length - 1; i >= 0; i--) {
			System.out.print(strArray[i]);
		}
		System.out.println();
		System.out.println("================");
		//4. using for loop
		int len=s.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
}
