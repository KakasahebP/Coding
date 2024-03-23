package Practice;

public class LargestNoArray {
	public static void main(String[] args) {
	
		int a[]= {4,8,9,7,3,6,2};
		int size=a.length;
		int max=a[0];
		for(int i=0;i<size;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
