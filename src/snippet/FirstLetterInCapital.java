package snippet;

import org.apache.commons.lang3.StringUtils;  

public class FirstLetterInCapital {
	
	public static void main(String[] args) {
		
		//1st way
		String s="javapoint";
		String result=s.substring(0, 1).toUpperCase()+s.substring(1).toLowerCase();
		System.out.println(result);
		System.out.println("=========================");
		
		//2nd way
		System.out.println(StringUtils.capitalize("robert"));     
		System.out.println(StringUtils.capitalize("jack"));          
		System.out.println(StringUtils.capitalize("tom"));   
	}

}
