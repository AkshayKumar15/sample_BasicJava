package Day5;

public class Method3 {
	
	public static void main()   // test method with no arg.
	{
		System.out.println("Running test method..");
	}
	
	int main(int a,int b)   // test method with int type of arg.
	{
		System.out.println("Running test method..");
		return 10;
	}
	
	
	
	public static void main(String[] args) {
		Method3 m1=new Method3();
		main();
		m1.main(10,20);
	}

}
