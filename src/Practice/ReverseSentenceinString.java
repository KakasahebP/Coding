package Practice;

public class ReverseSentenceinString {
	public static void main(String[] args) {
		
		String s="Java is programming language";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		//Reverse sentence word by word
		System.out.println("===========================");
		
		String word[]=s.split(" ");
		String rever=" ";
		for(int i=word.length-1;i>=0;i--)
		{
			rever=rever+word[i]+" ";
		}
		System.out.println(rever);

	}
}
