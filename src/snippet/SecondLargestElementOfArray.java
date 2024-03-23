package snippet;

import java.util.Arrays;

public class SecondLargestElementOfArray {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 1, 6, 9, 10 };
		Arrays.sort(arr);
//		int temp;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
		//1 2 3 6 9 10
		//2nd highest number
		System.out.println(arr.length);
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] != arr[arr.length - 1]) {
				System.out.println("The second largest element: " + arr[i]);
				break;
			}
		}
		//3rd highest number
		for(int i=arr.length-3;i>=0;i--)
		{
			if(arr[i]!=arr[arr.length-2])
			{
				System.out.println("Third highest number: "+arr[i]);
				break;
			}
		}

	}

}