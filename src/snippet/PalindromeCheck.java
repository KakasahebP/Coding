package snippet;

public class PalindromeCheck {
	public static void main(String[] args) {

		// Write a program to check if a given string is a palindrome in Java.

		String str = "racecar";
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				System.out.println(str + " is not a palindrome.");
				return;
			}
			i++;
			j--;
		}
		System.out.println(str + " is a palindrome.");
		// 2nd way
		System.out.println("===================");

		String s = "madame";
		String rev = "";
		for (int k = s.length() - 1; k >= 0; k--) {
			rev = rev + s.charAt(k);
		}
		if (s.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}
