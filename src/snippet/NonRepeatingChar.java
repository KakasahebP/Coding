package snippet;

public class NonRepeatingChar {
    public static void main(String[] args) {
    	
    	//Write a program to find the first non-repeating character in a string in Java.

        String str = "teetcode";
//        int[] freq = new int[26];
//        for (int i = 0; i < str.length(); i++) {
//            freq[str.charAt(i) - 'a']++;
//        }
//        for (int i = 0; i < str.length(); i++) {
//            if (freq[str.charAt(i) - 'a'] == 1) {
//                System.out.println("First non-repeating character: " + str.charAt(i));
//                return;
//            }
//        }
//        System.out.println("There are no non-repeating characters in the string.");
        
        for(int i=0;i<str.length();i++){
        	boolean unique=true;
        	for(int j=0;j<str.length();j++){
        		if(i!=j && str.charAt(i)==str.charAt(j)){
        			unique=false;
        			break;
        		}
        	}
        	if(unique){
        		System.out.println("First non-repeated character :"+str.charAt(i));
        		break;
        	}
        }
    }
}
