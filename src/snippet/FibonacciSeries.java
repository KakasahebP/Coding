package snippet;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int i,no=7;
		int first=0,second=1,next;
		for(i=0;i<no;i++)
		{
			System.out.print(first);
			next=first+second;
			first=second;
			second=next;
		}
	}

}
