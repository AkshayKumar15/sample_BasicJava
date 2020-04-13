package Day5;

public class String3 {
	
	public static void main(String[] args) {
		String s1="This is my hello world";
		String s2="hello world";
		//System.out.println(s1.compareToIgnoreCase(s2));
		//System.out.println("Before split: "+s1);
		//System.out.println(s1.charAt(4));
		//System.out.println(s1.contains("HE"));
		//System.out.println(s1.endsWith("D"));
		//System.out.println(s1.toLowerCase());
		//System.out.println(s2.toUpperCase());
		//System.out.println(s1.length());
		//System.out.println("Before Trim: "+s1);
		//s1=s1.trim();
		//System.out.println("After trim: "+s1);
		//System.out.println(s1.length());
		/*String []A=s1.split("s");
		for(int i=0;i<A.length;i++)
		{
			System.out.println("After split: "+A[i]);
		}
		*/
		System.out.println(s1.replace("is","are"));
	}

}
