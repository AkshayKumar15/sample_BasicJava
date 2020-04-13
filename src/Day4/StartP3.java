package Day4;

import java.util.Scanner;

public class StartP3 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character to be print: ");
		String str=sc.next();
		System.out.println("Enter the length of the character: ");
		int len=sc.nextInt();
		
		sc.close();
		
		for(int i=1;i<=len;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(str);
			}
			System.out.println();
		}
		for(int i=len-1;i>=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(str);
			}
			System.out.println();
		}
		
	}

}
