package snippet;

public class SplitCharNumber {
	public static void main(String[] args) {
		
		String s="12345Java896?>";
		StringBuffer alpha = new StringBuffer(),   
			         num = new StringBuffer(), 
			         special = new StringBuffer();  
			         for (int i=0; i<s.length(); i++)
			         {
			             if (Character.isDigit(s.charAt(i)))  
			             {
			                 num.append(s.charAt(i)); 
			             }
			             else if(Character.isAlphabetic(s.charAt(i))) 
			             {
			                 alpha.append(s.charAt(i));  
			             }
			             else  {
			                 special.append(s.charAt(i));  
			             }
			             
			         }
			         
			         System.out.println("Alphabets are: "+alpha);
			         System.out.println("Numbers are: "+num);
			         System.out.println("Special symbols are: "+special);
			         
			         //Sum of digits
			         int no=Integer.parseInt(num.toString());
			         int rem,sum=0;
			         while(no>0)
			         {
			        	  rem=no%10;
			        	  sum=sum+rem;
			        	  no=no/10;
			        	 
			         }
			         System.out.println("Sum is : "+sum);
			         System.out.println("===========================================");
			         
			         
		//Second Method for spliting
			         String str = "Kakasaheb12345>?@#";  
			         String[] part = str.split("(?<=\\D)(?=\\d)");  
			         System.out.println(part[0]);  
			         System.out.println(part[1]);
	}

}
