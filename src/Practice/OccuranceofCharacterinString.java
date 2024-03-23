package Practice;

import java.util.HashMap;
import java.util.Map;

public class OccuranceofCharacterinString {
	public static void main(String[] args) {
		/*
		String s="jAva is programming language";
		char chars[]=s.toCharArray();
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		for(char ch:chars)
		{
			if(map.containsKey(ch))
			{
				int count=map.get(ch);
				map.put(ch, count+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		System.out.println(map);   */
		
		String s="kakasaheb pawar";
		Map<Character,Integer>map=new HashMap<Character, Integer>();
		char chars[]=s.toCharArray();
		for(char ch:chars) {
			if(map.containsKey(ch)) {
				int count=map.get(ch);
				map.put(ch, count+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		
	}

}
