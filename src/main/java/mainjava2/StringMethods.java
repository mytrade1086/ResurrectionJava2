package mainjava2;

public class StringMethods {

	public static void main(String[] args) {
		
		String text="this is sparta";
		
		//1 length()
		System.out.println("Length is "+text.length()); //14
		
		//2  ,indexof(String str)
		System.out.println("index of t is "+text.indexOf("t")); //0
		
		//indexof(int ch) 
		System.out.println("index of t is "+text.indexOf(116)); //0  t has ASCII=116
		
		//3
		System.out.println("index of z is "+text.indexOf("z")); //-1 if searched item does not exists
		
		
		//lastIndexof
		System.out.println("Last index of t "+text.lastIndexOf("t"));//12
		
		System.out.println("Last index of t when starting from index 13 "+text.lastIndexOf("t", 13));//12
		
		
		
		
		
		
		//4 chatAt()
		System.out.println("index of z is "+text.charAt(0));//t
		System.out.println("index of z is "+text.charAt(1));//h
		
		
		//if char searched index out of length then exception
		//System.out.println("index of z is "+text.charAt(1000)); //java.lang.StringIndexOutOfBoundsException
		
		
		//5
		System.out.println(text.compareToIgnoreCase("this is sparta"));//0
		// 0 if strig equal
		// -1 if string1 comes before string 2
		// 1 if if string1 come after string 2
		
		
		System.out.println("A".compareToIgnoreCase("A"));//0
		
		System.out.println("A".compareToIgnoreCase("B"));//-1
		
		System.out.println("B".compareToIgnoreCase("A"));//1
		
		//6
		
        System.out.println("A".compareTo("A"));//0
		System.out.println("A".compareTo("B"));//-1
		System.out.println("B".compareTo("A"));//1
		
		String text1="java";
		String text2="neha";
		
		System.out.println("text1 compared to text2" +text1.compareTo(text2));//-4
		System.out.println("text2 compared to text1" +text2.compareTo(text1));//4
		
		System.out.println("B".compareTo("A"));//1
		System.out.println("C".compareTo("A"));//2
		
		
		
		
		//7  tolowercaase
		
		System.out.println("suMIT".toLowerCase());
		
		//8 touppercase()
		System.out.println("suMIT".toUpperCase());
		
		//9 trim()
		System.out.println("     suMIT".length());//10
		System.out.println("     suMIT".trim().length());//5
		
		//replace()
		
		System.out.println("thisislove".replace("o", "O"));//thisislOve
		
		
		System.out.println("Removing a-zA-Z from thisis90df "+ "thisis90df".replaceAll("[a-z A-Z]", ""));//Removing a-zA-Z thisis90df 90
		
		//substring
		
		System.out.println("thisisagain".substring(2)); //isisagain    gets everything from index 2
		
		System.out.println("thisisagain".substring(2,5)); //isi gets 3 char frarting from index 2
		
		
		
		//concat
		
		String s1="sumit";
		String s2="raut";
		System.out.println(s1.concat(s2));//sumitraut
		
		//.equals
		
		String s3="sumit";
				
				System.out.println(s1.equals(s2));//fasle
		System.out.println(s1.equals(s3));//true
				
		
				
		
		
	}
	
}
