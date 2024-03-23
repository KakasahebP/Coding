package Practice;

public class ReverseCharArray {
	public static void main(String[] args) {
		
		char chr[]= {'a','b','c','d'};
		int r=chr.length-1;
		int l=0;
		while(r>l)
		{
			char ch=chr[r];
			chr[r]=chr[l];
			chr[l]=ch;
			l++;
			r--;
		}
		for(int i=0;i<chr.length;i++)
		{
			System.out.print(chr[i]+",");
		}
	}

}
