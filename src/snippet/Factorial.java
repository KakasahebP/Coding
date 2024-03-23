package snippet;

public class Factorial {
    public static void main(String[] args) {
    	
    	//Write a program to find the factorial of a given number in Java.
    	
        int num = 5;
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact =fact* i;
        }
        System.out.println("Factorial of " + num + " is " + fact);
    }
}

