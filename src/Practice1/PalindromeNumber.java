package Practice1;

public class PalindromeNumber {
public static void main(String[] args) {
	
	int no=2572;
	int rem,pal=0;
	int oriNo=no;
	while(no>0) {
		rem=no%10;
		pal=pal*10+rem;
		no=no/10;
	}
	if(oriNo==pal) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not palindrome");
	}
}

}
