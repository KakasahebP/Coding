package Practice1;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
public static void main(String[] args) {
	
	String s="kakasaheb";
	String rev="";
	Map<Character,Integer>map=new HashMap();
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
	System.out.println("==============================");
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
	System.out.println("==============================");
	String s1="java java is is good and and easy";
	String str[]=s1.split(" ");
	Map<String,Integer>map1=new HashMap<String, Integer>();
	
	for(String st:str) {
		if(map1.containsKey(st)) {
			int count1=map1.get(st);
			map1.put(st, count1+1);
		}else {
			map1.put(st, 1);
		}
	}
	System.out.println(map1);
	System.out.println("==========================");
	String s2="java is language";
	String rev1="";
	String words[]=s2.split(" ");
	for(String word:words) {
		String revWord="";
		for(int i=word.length()-1;i>=0;i--) {
			revWord=revWord+word.charAt(i);
		}
		rev1=rev1+revWord+" ";
	}
	System.out.println(rev1);
	System.out.println("====================");
	int a[]= {4,5,9,7,8,6,3};
	int max=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
	System.out.println("max no is:"+max);
	System.out.println("=============================");
	int b[]= {7,9,8,4,6,1};
	int min=b[0];
	for(int i=0;i<b.length;i++) {
		if(b[i]<min) {
			min=b[i];
		}
	}
	System.out.println("min num:"+min);
	
}
}
