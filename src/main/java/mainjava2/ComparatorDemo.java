package mainjava2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
	//https://beginnersbook.com/2013/12/java-string-compareto-method-example/
	//1 Comparator interface has 2 methods
	//                                    .equalsTo and compare(Obj1,Obj2)

	public static void main(String[] args) {
	
		ArrayList<Student> ar = new ArrayList<Student>(); 
        ar.add(new Student(111, "bbbb", "london")); 
        ar.add(new Student(131, "aaaa", "nyc")); 
        ar.add(new Student(121, "cccc", "jaipur")); 
        
        System.out.println("Before Sorting "+ar);//Before Sorting [111 bbbb london, 131 aaaa nyc, 121 cccc jaipur]
        Collections.sort(ar, new Sortbyroll());
        System.out.println("After Sorting "+ar);//Before Sorting [111 bbbb london, 121 cccc jaipur, 131 aaaa nyc]
	}
}


class Student 
{ 
    int rollno; 
    String name, address; 
  
    // Constructor 
    public Student(int rollno, String name, 
                               String address) 
    { 
        this.rollno = rollno; 
        this.name = name; 
        this.address = address; 
    } 
  
    // Used to print student details in main() 
    public String toString() 
    { 
        return this.rollno + " " + this.name + 
                           " " + this.address; 
    } 
} 


class Sortbyroll implements Comparator<Student> 
{ 
    // Used for sorting in ascending order of 
    // roll number 
    public int compare(Student a, Student b) 
    { 
       // return a.rollno - b.rollno;  //Ascending
    	if(a.rollno<b.rollno) {
    		return 1; //Descending
    	}
    	else {
    		
    		return -1;
    	}
    	
    } 
} 