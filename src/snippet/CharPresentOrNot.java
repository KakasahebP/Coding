package snippet;

import java.util.Arrays;

public class CharPresentOrNot {
	
	public static void main(String[] args) {
		
		String s="opentext";
		char c='t';
		
		//check character is present or not
		if(s.indexOf(c)==-1)
		{
			System.out.println("Given character is not available");
			System.exit(0);
		}
		//replace char occurance in string
		char ch[]=s.toCharArray();
		int count=1;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==c)
			{
				ch[i]=String.valueOf(count).charAt(0);
				count++;
			}
		}
		System.out.println(Arrays.toString(ch));
	}

}
