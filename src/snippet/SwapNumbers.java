package snippet;

import java.util.Scanner;

public class SwapNumbers {

public static void main(String[] args) {
	
	//swap 2 numbers without using 3rd variable
//	int a = 10;
//	int b = 20;
//
//    System.out.println("a is " + a + " and b is " + b);
//
//	a = a + b;
//	b = a - b;
//	a = a - b;
//
//    System.out.println("After swapping, a is " + a + " and b is " + b);
	
	System.out.println("============================");
	//using 3rd variable
	int x, y, z; 
	  Scanner sc = new Scanner(System.in);
	  x = sc.nextInt(); y = sc.nextInt(); 
	  System.out.println("Before swapping\n x = " + x + "\n y = " + y);
	  z = x; x = y; y = z; 
	  System.out.println("After swapping\n x = " + x + "\n y = " + y);
    }

}
