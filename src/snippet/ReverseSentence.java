package snippet;

public class ReverseSentence {
	public static void main(String[] args) {
		
		String sentence = "Java Interview Questions";
        
        String rev="";
        String words[]=sentence.split("");
        for(int i=words.length-1;i>=0;i--)
        {
        	rev=rev+words[i]+"";
        }
        System.out.println(rev);
        
        System.out.println("==========================");
        String rev1="";
        for(int i=sentence.length()-1;i>=0;i--) {
        	rev1=rev1+sentence.charAt(i);
        }
        System.out.println(rev1);
	}
	
}

