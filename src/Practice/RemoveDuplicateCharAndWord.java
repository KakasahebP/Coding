package Practice;

public class RemoveDuplicateCharAndWord {
	public static void main(String[] args) {

		//program to remove duplicate characters from string
		String s = "javaprogramming";
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (result.indexOf(ch) == -1) {
				result = result + ch;
			}
		}
		System.out.println(result);

		System.out.println("=================================");
		//program to remove duplicate words from string
		
		String str = "java is java is easy to to learn";
		String word[] = str.split(" ");
		String res = "";
		for (int i = 0; i < word.length; i++) {
			String w = word[i];
			if (res.indexOf(w) == -1) {
				res = res + w + " ";
			}
		}
		System.out.println(res);
	}

}
