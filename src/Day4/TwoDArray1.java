package Day4;

public class TwoDArray1 {
	
	public static void main(String[] args) {
		int a[][]=new int[2][2];
		a[0][0]=1;
		a[0][1]=12;
		a[1][0]=3;
		a[1][1]=14;
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
