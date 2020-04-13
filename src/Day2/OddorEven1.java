package Day2;

import java.util.Scanner;

public class OddorEven1 {
	
	/*
	 *  Q. find the no. is odd or even?
	 */
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("No. is even");
			if(a>10)
			{
				System.out.println("A is greater than 10");
			}
			else
			{
				System.out.println("A is less than 10");
			}
		}
		else
		{
			System.out.println("No. is Odd");
		}
		
	}

}
