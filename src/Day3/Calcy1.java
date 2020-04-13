package Day3;

import java.util.Scanner;

public class Calcy1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A: ");
		int a=sc.nextInt();
		System.out.println("Enter B: ");
		int b=sc.nextInt();
		System.out.println("Enter 1:add   2:sub   3:div   4:mul ");
		int op=sc.nextInt();
		int result=0;
		switch(op)
		{
		case 1: result=a+b;  System.out.println("Sum is "+result);
		break;
		case 2: result=a-b;  System.out.println("sub is "+result);
		break;
		case 3: result=a/b;  System.out.println("div is " +result);
		break;
		case 4: result=a*b;  System.out.println("mul is "+result);
		break;
		default: System.out.println("Invalid Entry");
		}
	}

}
