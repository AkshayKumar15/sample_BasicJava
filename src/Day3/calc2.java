package Day3;

import java.util.Scanner;

public class calc2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A: ");
		int a=sc.nextInt();
		System.out.println("Enter B: ");
		int b=sc.nextInt();
		int sum=a+b;
		int sub=a-b;
		int div=a/b;
		int mul=a*b;
		System.out.println("sum is "+sum);
		System.out.println("sub is "+sub);
		System.out.println("div is "+div);
		System.out.println("mul is "+mul);
	}

}
