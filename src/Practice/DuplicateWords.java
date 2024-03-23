package Practice;

import java.util.*;

public class DuplicateWords {
	public static void main(String[] args) {

		String str = "Big black bug bit a big black dog on his big black nose";
		
		// Used to split string around spaces.
		StringTokenizer st = new StringTokenizer(str);
		
		// To store individual visited words
		Set<String> set = new HashSet<>();
		
		// Traverse through all words
		while (st.hasMoreTokens()) {
			String word = st.nextToken();

			// If current word is not seen before.
			while (!set.contains(word)) {
				System.out.print(word + " ");
				set.add(word);
			}
		}
	}
}
