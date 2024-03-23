package Practice;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.WordUtils;

public class FirstLetterinCapital {
	public static void main(String[] args) {
		
		String s="java";
		String result=s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
		System.out.println(result);
		//System.out.println(StringUtils.capitalize(s));
		System.out.println("==============================");
		
		//capitalize the first character of each word in a string
		
		String s1="java is programming language";
		System.out.println(WordUtils.capitalize(s1));
		
		System.out.println("===================================");
		String word[]=s1.split(" ");
		int totalWords=word.length;
		System.out.println("Total words in given string is: "+totalWords);
		StringBuffer sb= new StringBuffer();
		for(int i=0;i<totalWords;i++)
		{
			sb.append(Character.toUpperCase(word[i].charAt(0))).append(word[i].substring(1)).append(" ");
			
		}
		System.out.println(sb.toString().trim());
		
	}

}
