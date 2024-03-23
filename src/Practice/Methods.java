package Practice;

public class Methods {
	
	public void m1(Object a)
	{
		System.out.println("Hi");
	}
	public void m1(String s)
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		
		Methods m=new Methods();
		m.m1(null);
	}
}
