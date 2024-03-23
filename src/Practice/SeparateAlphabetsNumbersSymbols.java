package Practice;

public class SeparateAlphabetsNumbersSymbols {
	public static void main(String[] args) {
		
		String s="123abcd!@#$";	
		StringBuffer alpha=new StringBuffer(),
				num=new StringBuffer(),
				symbol=new StringBuffer();
		for(int i=0;i<s.length();i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
				alpha.append(s.charAt(i));
			}
			else if(Character.isDigit(s.charAt(i))) {
				num.append(s.charAt(i));
			}
			else {
				symbol.append(s.charAt(i));
			}
		}
		System.out.println("Alphabets :"+alpha);
		System.out.println("Numbers :"+num);
		System.out.println("Symbols :"+symbol);   
		
		System.out.println("==============================");
		//print only character
		String str="Selenium123";
		StringBuffer alp=new StringBuffer();
		for(int i=0;i<str.length();i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				alp.append(str.charAt(i));
			}
			else {
				num.append(str.charAt(i));
			}     
		}    
		System.out.println(alp);	
	}

}
