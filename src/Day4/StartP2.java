package Day4;

import java.util.Scanner;

public class StartP2 {
	
	/*
	 * Q. Take length and character at run time from the user to print pattern in java.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length to be printed: ");
		int length=sc.nextInt();
		System.out.println("Enter the character to be printed: ");
		String char1=sc.next();
		for(int i=1;i<=length;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(char1);
			}
			System.out.println();
		}
		
	}

}
