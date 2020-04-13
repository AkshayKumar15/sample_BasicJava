package Day3;

public class StartPattern1 {
	
	
	public static void main(String[] args) {
		for(int i=5;i>=1;i--)   // i as no. of row
		{
			for(int j=1;j<=i;j++)    // j as no. of column
			{
				System.out.print(j);    //  * to be printed
			}
			System.out.println();
		}
	}

}
