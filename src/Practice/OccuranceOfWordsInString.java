package Practice;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfWordsInString {
	public static void main(String[] args) {
		
		String s="java is is easy to to learn learn";
		String arr[]=s.split(" ");
		Map<String,Integer> map=new HashMap<String, Integer>();
		for(String s1:arr) {
			if(map.containsKey(s1)) {
				int count=map.get(s1);
				map.put(s1, count+1);
			}
			else {
				map.put(s1, 1);
			}
		}
		System.out.println(map);
	}

}
