package snippet;

public class NumberOfDigits {

	public static void main(String[] args) {

		int no = 12345, a = 0;
		if (no < 0) {
			no = no * -1;
		} else if (no == 0) {
			no = 1;
		}
		while (no > 0) {
			no = no / 10;
			a++;
		}
		System.out.println("Number of digits are: " + a);
	}

}
