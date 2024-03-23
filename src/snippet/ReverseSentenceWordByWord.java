package snippet;

public class ReverseSentenceWordByWord {
    public static void main(String[] args){
    	
    	
        String sentence = "Java Interview Questions";
        
        String rev="";
        String words[]=sentence.split(" ");
        for(int i=words.length-1;i>=0;i--)
        {
        	rev=rev+words[i]+" ";
        }
        System.out.println(rev);
//        String reversedSentence = reverseSentence(sentence);
//        System.out.println(reversedSentence);
    }
//    public static String reverseSentence(String sentence){
//        String reverse = "";
//        String[] words = sentence.split("\\s");
//        for(int i=words.length-1;i>=0;i--){
//            reverse = reverse + words[i] + " ";
//        }
//        return reverse;
//    }
}