package mainjava2;

public class EqualsvsReferenceComparison {

	
	//1 .equals in String is overridden for content comparison
	//== in Object is means for reference comparison
	
	
	public static void main(String[] args) {
	
		String s1=new String("sumit");
		//here 2 Objects created  1. Heap 2.SCP and points to Heap
		
		String s2="Amit"; //1 Object on SCP
		String s3="sumit";//points to SCP object now
		String s4="sumit";
		
		String s6=new String("sumit");
		
		
		String s5=new String ("Amit");
		System.out.println(s4==s3);//true
		
		System.out.println(s1.equals(s3));//true
		System.out.println(s1.equals(s3));//true
		
		System.out.println(s2.equals(s5));//true
		System.out.println(s2==s5);//false
		
	}
}
