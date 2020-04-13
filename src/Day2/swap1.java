package Day2;

import java.util.Scanner;

public class swap1 {
	
	/*
	 * Q. swap two no. using temp variable
	 */
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a=sc.nextInt();    // a=10
		System.out.println("Enter the value of b: ");
		int b=sc.nextInt();    // b=20
		System.out.println("Before swap - value of a is "+a);
		System.out.println("Before swap - value of b is "+b);
		int temp=a;    // temp=10
		a=b;           // a=20
		b=temp;        // b=10
		System.out.println("After swap - value of a is "+a);
		System.out.println("After swap - value of b is "+b);
		
	}

}
