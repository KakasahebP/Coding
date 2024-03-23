package Practice1;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {

	public static void main(String[] args) 
	{
	/*	
		String s="kakasahebpawar";
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		char chars[]=s.toCharArray();
		for(char ch:chars) {
			if(map.containsKey(ch)) {
				int count= map.get(ch);
				map.put(ch, count+1);
			
			}
			else {
				map.put(ch, 1);
			}
		}
		for(Map.Entry<Character, Integer>entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
		System.out.println(map);
			*/
	String s="kakasahebpawar";
	char ch[]=s.toCharArray();
	int count;
	for(int i=0;i<ch.length;i++) {
		count=1;
		for(int j=i+1;j<ch.length;j++) {
			
			if(ch[i]==ch[j]&&ch[i]!=' ') {
				count++;
			}
		}
		if(count>1) {
			System.out.println(ch[i]);
		}
	}

}
}
