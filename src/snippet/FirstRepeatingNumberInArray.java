package snippet;

import java.util.ArrayList;
import java.util.List;

public class FirstRepeatingNumberInArray {
	public static void main(String[] args) {
		
		int arr[]= {1,2,2,3,5,5,4,6,8};
		List<Integer> list= new ArrayList<>();
		for(int i:arr) {
			if(list.contains(i)) {
				System.out.println("First repeating Number is :"+i);
				break;
			}
			else {
				list.add(i);
			}
		}
	}

}
