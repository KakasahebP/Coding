package Practice1;

public class Star3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=n;i>=1;i--) {  //rows
			for(int j=1;j<i;j++) {  //spaces
					System.out.print(" ");
					}
			for(int k=0;k<=n-i;k++){  //print star
					System.out.print("*");
					}
			System.out.println();
			}
		}
	}


