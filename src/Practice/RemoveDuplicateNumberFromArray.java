package Practice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateNumberFromArray {
	public static void main(String[] args) {
		
		int a[]= {4,5,3,2,6,9,4};
		Set<Integer>set=new LinkedHashSet<>();
		for(int no:a)
		{
			set.add(no);
		}
		Integer result[]=set.toArray(new Integer[set.size()]);
		System.out.println(Arrays.toString(result));
	}

}
