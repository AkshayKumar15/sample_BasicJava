package Day5;

public class String1 {
	
	public static void main(String[] args) {
		String s1="TekArch";
		String s2=new String("TekArch");
		
		s1=s1.concat("Technology");
	//	System.out.println(s1);
		
		StringBuilder sb=new StringBuilder("TekArch");
		System.out.println(sb.toString());
		sb.append("Technology");
		System.out.println(sb.toString());
	}

}
