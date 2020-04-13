package Day1;

public class Variables1 {
	 
	public int a=10;            // instance/globle variable
	public static int b=20;     // static variable
	
	public static void main(String[] args) {
		Variables1 v1=new Variables1();
		
		int c=30;     // local variable
		
		System.out.println(v1.a);
		System.out.println(b);
		System.out.println(c);
	}

}
