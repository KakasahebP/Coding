package snippet;

public class AdditionStringNumber {
	
	public static void main(String[] args) {
		
		String s="123456";
		int rem,sum=0;
		int no=Integer.parseInt(s);
		while(no>0) {
		     rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		System.out.println("Addition is: "+sum);
	}

}
