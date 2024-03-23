package Practice1;

public class Fibonnaci {
	public static void main(String[] args) {
		
		int no=7;
		int a=0,b=1;
		System.out.print(a+","+b);
		for(int i=1;i<=no;i++) {
			int c=a+b;
			System.out.print(","+c);
			a=b;b=c;
		}
	}

}
