package Practice;

public class ReverseEachWordinString {
	public static void main(String[] args) {
		
		String s="Java is programming language";
		String rev="";
		String words[]=s.split(" ");
		System.out.println("Total words are : "+words.length);
		for(String word:words)
		{
			String revWord="";
			for(int i=word.length()-1;i>=0;i--)
			{
				revWord=revWord+word.charAt(i);
			}
			rev=rev+revWord+" ";
		}
		System.out.println(rev);
	}
}
