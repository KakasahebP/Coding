package Practice;

public class FirstNonRepeatingCharacterinString {
	public static void main(String[] args) {
		
		String s="pprogram";
		for(int i=0;i<s.length();i++)
		{
			boolean unique=true;
			for(int j=0;j<s.length();j++)
			{
				if(i!=j&&s.charAt(i)==s.charAt(j))
				{
					unique=false;
					break;
				}
			}
			if(unique)
			{
				System.out.println("First non repeating character is: "+s.charAt(i));
				break;
			}
		}
	}

}
