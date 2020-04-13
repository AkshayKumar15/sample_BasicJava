package Day4;

public class Methods1 {
	
	static int a=10;  // instance variable
	
	static void test2(int a)
	{
		a=50;    // re-initialization of a
		int c=30;
		System.out.println(c);   // c will be 30
		System.out.println(a);  // a will be 50
	}
	
	static void test1()
	{
		int c=30;
		System.out.println(c);   // c will be 30
		System.out.println(a);   // a will be 10
	}
	
	public static void main(String[] args) {
		int b=20;
		
		Methods1 m1=new Methods1();
		System.out.println(a);
		System.out.println(b);
		test1();    // calling way of no. argg (test1) method
		test2(10);  // calling way of int type argg (test2) method
	}

}
