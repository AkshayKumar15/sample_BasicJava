package Day4;

public class OneDArray1 {
	
	public static void main(String[] args) {
		int a[]=new int[5];    // length of an array is 5, index will be (length-1, i.e 4)
		a[0]=10;  // initialization
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		for(int i=0;i<a.length;i++)   // length is property of an array
		{
			System.out.println("Value at index "+i+" is "+a[i]);  
		}
		
	}

}
