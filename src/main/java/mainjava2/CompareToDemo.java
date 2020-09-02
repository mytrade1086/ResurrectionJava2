package mainjava2;

public class CompareToDemo {

	public static void main(String[] args) {
		
		//1. Comparing with empty String
		
		String s1="Sumit";
		String s2="";
		
		System.out.println(s1.compareTo(s2));//5  So can be used to find length of String without length
		System.out.println(s2.compareTo(s1));//-5
		
		
		
		//2. Comparing "Astro" and Bzooka"
		
		String s3="Astro";
		String s4="Bzooka";
		String s5="Craz";
		String s6="Caaaaaaaaaaaaraz";
		
		System.out.println(s3.compareTo(s4));//==-1
		System.out.println(s3.compareTo(s5));//==-2
		System.out.println(s3.compareTo(s6));//==-2
	}
}
