package snippet;
import java.util.Arrays;

public class SortStringByChar {

	public static void main(String[] args) {

		String s = "ghabik";
		//one way
		char ch[] = s.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);
		System.out.println("==================");
		
		//2nd way
		char temp;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		System.out.println(new String(ch));
	}

}
