package snippet;

public class ReverseEachWordOfString {
	public static void main(String[] args) {
		String s = "Java is good programming language";
		String[] words = s.split(" ");
		String revString = "";
		
		for(String word:words)
		{
			String revWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				revWord = revWord + word.charAt(i);
			}
		revString = revString + revWord + " ";
		}
//		for (int i = 0; i < words.length; i++) {
//			String word = words[i];
//			String revWord = "";
//			for (int j = word.length() - 1; j >= 0; j--) {
//				revWord = revWord + word.charAt(j);
//			}
//			revString = revString + revWord + " ";
//		}
		System.out.println(s);
		System.out.println(revString);
		System.out.println("-------------------------");
	}

}
