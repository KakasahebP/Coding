package snippet;

public class PalindromeNumber {

	public static void main(String[] args) {

		int a, no = 121;
		int temp = 0;
		int orignalno = no;
		while (no > 0) {
			a = no % 10;
			no = no / 10;
			temp = temp * 10 + a;
		}
		if (temp == orignalno) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}
