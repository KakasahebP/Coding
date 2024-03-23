package Practice;

public class SumOfDigitsInSingleDigit {
	public static void main(String[] args) {

		int no = 12345;
		int rem, sum = 0;
		while (no > 0 || sum > 9) {
			if (no == 0) {
				no = sum;
				sum = 0;
			}
			rem = no % 10;
			sum = sum + rem;
			no = no / 10;
		}
		System.out.println(sum);
	}

}
