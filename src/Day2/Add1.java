package Day2;

import java.util.Scanner;

public class Add1 {
	/*
	 * a=10,b=20, find a+b?
	*/
	public static void main(String[] args) {
	//	int a=10;
	//	int b=20;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b: ");
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println("sum of two no. is "+sum);
		
	}

}
