package snippet;

public class MergeTwoStringsAlternatively {
	public static void main(String[] args) {
		
		String s1="java";
		String s2="1234";
		String result="";
		for(int i=0;i<s1.length()|i<s2.length();i++) {
			if(i<s1.length()) {
				result=result+s1.charAt(i);
			}
			if(i<s2.length())
			{
				result=result+s2.charAt(i);
			}
		}
		System.out.println(result);
	}

}
