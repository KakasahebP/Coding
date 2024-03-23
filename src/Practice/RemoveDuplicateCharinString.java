package Practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharinString {
	public static void main(String[] args) {
		
		String str="javaprogramming";
		String result="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(result.indexOf(ch)==-1) {
				result=result+ch;
			}
		}
		System.out.println(result);
		System.out.println("=================================");
		
		String s="programming";
		StringBuilder sb=new StringBuilder();
		s.chars().distinct().forEach(c->sb.append((char)c));
		System.out.println(sb);
		System.out.println("======================");
		
		StringBuilder sb2= new StringBuilder();
		Set<Character> set= new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{
			sb2.append(ch);
		}
		System.out.println(sb2);
		System.out.println("==============================");
		String s1="kakasaheb";
		StringBuilder sb3=new StringBuilder();
		s1.chars().distinct().forEach(m->sb3.append((char)m));
		System.out.println(sb3);
		
		System.out.println("==============================");
		String s2="kakasaheb";
		StringBuffer sb4=new StringBuffer();
		s2.chars().distinct().forEach(m->sb4.append((char)m));
		System.out.println(sb4);
	}

}
