package Practice;

public class CountCapitalLetters {
	public static void main(String[] args) {
		
		String s="Java Is Programming LanguagE";
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A'&& s.charAt(i)<='Z')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}
	

}
