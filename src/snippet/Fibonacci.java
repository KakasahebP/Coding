package snippet;

public class Fibonacci {
    public static void main(String[] args) {
    	
    	//Write a program to find the nth Fibonacci number in Java.
    	
        int n = 10;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println("The " + n + "th Fibonacci number: " + dp[n]);
    }
}
