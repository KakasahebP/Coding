package Practice;

import java.util.Arrays;

public class SecondHighestNo {
	public static void main(String[] args) {
		
		int a[]= {2,5,4,9,7,7};
		Arrays.sort(a);
		for(int i=a.length-2;i>=0;i--)
		{
			if(a[i]!=a[a.length-1])
			{
				System.out.println(a[i]);
				break;
			}
		}
		//3r highest
		int b[]= {1,5,4,6,9,7,3,2};  //1,2,3,4,5,6,7,9
		Arrays.sort(b);
		for(int j=b.length-3;j>=0;j--)
		{
			if(b[j]!=b[b.length-2])
			{
				System.out.println(b[j]);
				break;
			}
		}
	}

}
