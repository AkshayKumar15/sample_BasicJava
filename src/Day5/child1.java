package Day5;

class parent1
{

	public void test()
	{
		System.out.println("Parent method running..");
	}
}

public class child1 extends parent1{
	
	public void test()
	{
		System.out.println("child method running..");
	}
	
	public static void main(String[] args) {
		parent1 p1=new child1();
		p1.test();
	}

}
