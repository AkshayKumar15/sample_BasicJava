package Day2;

import java.util.Scanner;

public class Greater1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b: ");
		int b=sc.nextInt();
		System.out.println("Enter the value of c: ");
		int c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("A is greater - value is "+a);
		}
		else if(b>c)
		{
			System.out.println("B is greater - value is "+b);
		}
		else
		{
			System.out.println("C is greater - value is "+c);
		}
	}

}
