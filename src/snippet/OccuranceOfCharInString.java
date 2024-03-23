package snippet;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfCharInString {
	
	public static void main(String[] args) {
		
		String s="hello";
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		char chars[]=s.toCharArray();
		for(char ch:chars)
		{
			if(!map.containsKey(ch))
			{
				map.put(ch, 1);
			}
			else
			{
				int count=map.get(ch);
				map.put(ch, count+1);
			}
		}
		System.out.println(map);
	}

}
