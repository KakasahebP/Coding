package snippet;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfWordsInString {
	public static void main(String[] args) {
		
		String s="java is is programming language language";
		String str[]=s.split(" ");
		Map<String,Integer>map=new HashMap();
		for(String s1:str) {
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
