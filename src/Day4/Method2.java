package Day4;

public class Method2 {
	
	public static int add(int a,int b)
	{
		int res=a+b;
		System.out.println("Hello, You are in add method..");
		return res;
	}
	
	public static int add1()
	{
		int a=10;
		System.out.println(a);
		return 50;
	}
	
	public static void main(String[] args) {
		
		add(10,20);     //    calling the add method
		System.out.println(add(10,20));    // printing the add method (return value will also printed)
		add1();         //    calling the add1 method
		System.out.println(add1());        // printing the add1 method (return value will also printed
		
	}

}
