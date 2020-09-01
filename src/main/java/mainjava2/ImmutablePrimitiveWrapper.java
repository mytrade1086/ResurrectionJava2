package mainjava2;

public class ImmutablePrimitiveWrapper {

	
	// Java program to demonstrate that prmitive 
	// wrapper classes are immutable 
	 public static void main(String[] args) 
	    { 
	        Integer i = new Integer(12); 
	        System.out.println(i); //12
	        modify(i); 
	        System.out.println(i); //12
	    } 
	  
	    private static void modify(Integer i) 
	    { 
	        i = i + 1; 
	    } 
	} 
	

//The parameter i is reference in modify and refers to same object as i in main(), but changes made to i are not reflected in main(), why?
//Explanation:
//All primitive wrapper classes (Integer, Byte, Long, Float, Double, Character, Boolean and Short) are immutable in Java,
//so operations like addition and subtraction create a new object and not modify the old.
//The below line of code in the modify method is operating on wrapper class Integer, not an int