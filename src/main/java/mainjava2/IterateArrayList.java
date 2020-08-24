package mainjava2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateArrayList {

	
	public static void main(String[] args) {
		
		List<String> artist=Arrays.asList("Bryan Adams", "Neha Kappar","Joe Rogan","Mehwish Hayat");
		
		//1 Lambda 
		artist.forEach(x->System.out.println("used lambda "+x));
		
		
		//2 Itertor
		Iterator<String> strIterator=artist.iterator();
		while(strIterator.hasNext()){
		System.out.println("used iterator "+strIterator.next());
		}
		
		
		//3 For Each Reamining with Iterator
		Iterator<String> strIterator2=artist.iterator();
		strIterator2.forEachRemaining(x->System.out.println("forEachRemaining "+x));
		
		
		//4.foreach loop
		
		for(String s: artist) {		
		System.out.println("Printed with foreach loop "+s);			
		}
		
		//5 Using index	
		for(int i=0;i<artist.size();i++) {
			System.out.println("Printed with index "+artist.get(i));
		}
		
		//6 List Iterator: We can print both direction
		ListIterator<String> listItr=artist.listIterator(artist.size());
		
		while(listItr.hasPrevious()){
		
			System.out.println("Reverse Order "+listItr.previous());
		}
		
//		while(listItr.hasNext())
//		{
//			System.out.println("Normal  Order "+listItr.next());
//		}
		
		
	}
}
