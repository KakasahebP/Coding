package Practice;

public class Armstrong {
	public static void main(String[] args) {
		
		int no=372;  //371=3*3*3+7*7*7+1*1*1
		int rem,arm=0;
		int oriNo=no;
		while(no>0)
		{
			rem=no%10;
			arm=arm+(rem*rem*rem);
			no=no/10;
		}
		if(oriNo==arm)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not armstrong no.");
		}
	}

}
