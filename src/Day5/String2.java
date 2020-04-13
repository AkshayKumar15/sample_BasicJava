package Day5;

public class String2 {
	
	public static void main(String[] args) {
		String s1="TekArch";
		String s2=new String("TekArch");
		
		String s3="TekArch";
		String s4=new String("TekArch");
		
		System.out.println(s1.equals(s2));  // true
		System.out.println(s1.equals(s3));  // true
		System.out.println(s1==s2);         // false
		System.out.println(s1==s3);         // true
		System.out.println(s2==s4);         // false
	}

}
