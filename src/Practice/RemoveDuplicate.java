package Practice;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {
	public static void main(String[] args) {

		//remove duplicate character from string
		String s="helloworld";
		int count=0;
		char chars[]=s.toCharArray();
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		for(char ch:chars)
		{
			if(map.containsKey(ch))
			{
				count=map.get(ch);
				map.put(ch, count+1);
			}
			if(count>1) {
				map.remove(ch, count);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		
		//remove duplicate string from sentence
		System.out.println("=====================");
		String str="abc pqr abc lmn";
		int count1=0;
		String word[]=str.split(" ");
		Map<String,Integer>m=new HashMap<String, Integer>();
		for(String w:word) {
			if(m.containsKey(w)) {
			  count1=m.get(w);
				m.put(w, count1+1);
				
			}
			if(count1>1) {
				m.remove(w,count1);
			}
			else {
				m.put(w, 1);
			}
		}
		System.out.println(m);
		
		

	}

}
