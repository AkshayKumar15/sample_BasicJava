package Day3;

import java.util.Scanner;

public class Week1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. ");
		int day=sc.nextInt();
		String dayName=" ";
		
		switch(day)
		{
		case 1:dayName="Mon";System.out.println("Today is "+dayName);
		break;
		case 2:dayName="Tue";System.out.println("Today is "+dayName);
		break;
		case 3:dayName="Wed";System.out.println("Today is "+dayName);
		break;
		case 4:dayName="Thu";System.out.println("Today is "+dayName);
		break;
		case 5:dayName="Fri";System.out.println("Today is "+dayName);
		break;
		case 6:dayName="Sat";System.out.println("Today is "+dayName);
		break;
		case 7:dayName="Sun";System.out.println("Today is "+dayName);
		break;
		default: System.out.println("Invalid Entry");
		}
	}

}
