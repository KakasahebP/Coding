package RahulShetty;

public class FibonacciSeriesExample {

	public static void main(String[] args) {

		int a = 0, b = 1, c;
		int no = 7;

		System.out.print(a + "," + b+",");
		for(int i=0;i<no;i++) 
		{
			c = a + b;
			System.out.print(c+",");
			a = b;
			b = c;
		}
	}

}