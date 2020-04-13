package Day2;

import java.util.Scanner;

public class Swap2 {
	

	/*
	 * Q. swap two no. without using temp variable
	 */
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a=sc.nextInt();    // a=10
		System.out.println("Enter the value of b: ");
		int b=sc.nextInt();    // b=20
		System.out.println("Before swap - value of a is "+a);
		System.out.println("Before swap - value of b is "+b);
		a=a+b;  //  a=30
		b=a-b;  // b=10
		a=a-b;  // a=20
		System.out.println("After swap - value of a is "+a);
		System.out.println("After swap - value of b is "+b);
		
	}

}
