package Practice;

public class LastwordStringPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="sachin is good boy";
		String word[]=s.split(" ");
		for(int i=0;i<word.length;i++) {
			if(word[i].equals("good")) {
				System.out.println(word[i]);
			}
			
		}

	}

}
