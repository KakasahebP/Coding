package Practice1;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		
		int a[]= {2,5,7,3,1,6,9};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]);
		}
	}

}
