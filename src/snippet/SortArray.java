package snippet;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		
		//How do you sort an array in Java?
		int arr[] = {1, 2, 3, -1, -2, 4};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("=====================");
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]);
		}
		
	}
	
}

