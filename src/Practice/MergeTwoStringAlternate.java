package Practice;

public class MergeTwoStringAlternate {
	public static void main(String[] args) {
		
		String s1="abcd";
		String s2="1234";
		String result="";
		for(int i=0;i<s1.length()|i<s2.length();i++) {
			if(i<s1.length()) {
				result+=s1.charAt(i);
			}
			if(i<s2.length()) {
				result+=s2.charAt(i);
			}
		}
		System.out.println(result);
	}

}
