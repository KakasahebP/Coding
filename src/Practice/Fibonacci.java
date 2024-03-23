package Practice;

public class Fibonacci {
	public static void main(String[] args) {
		//fibonacci
		int no=7;
		int a=0,b=1,c;
		System.out.print(a+","+b);
		for(int i=0;i<no;i++)
		{
			c=a+b;
			System.out.print(","+c);
			a=b;
			b=c;
		}
		//print no without using loop
		System.out.println("==================================");
		int no1=1;
		while(no1<=100)
		{
			System.out.print(no1+",");
			no1++;
		}
	}

}
