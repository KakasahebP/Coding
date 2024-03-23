package snippet;

public class LargestNoInArray {
	
	
	public static void main(String[] args) {
		
		int a[]={44,66,99,77,33,22,55};
		int size=a.length;
		int max=a[0];
		for(int i=0;i<size;i++)
				if(a[i]>max)
				{
					max=a[i];
				}
				System.out.println("Greater no.is "+max);
		}
} 
		
	
	


