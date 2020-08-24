package mainjava2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {

	public static void main(String[] args) {
		
		
		
		//Creating Predicate beforehand. We can create then inline as well
		Predicate<Integer> greaterthanFour=x->x>4;
		
		List<Integer> values=Arrays.asList(12,33,2,3,1,0,500);
		List<Integer> listwithpredicate=values.stream().filter(greaterthanFour).collect(Collectors.toList());
		
		System.out.println(values);//[12, 33, 2, 3, 1, 0, 500]
		System.out.println(listwithpredicate);//[12, 33, 500]
		
		
		//Creating PRedicate inline also used &&
		List<Integer> listwithpredicateAND=values.stream().filter(x->x>3 && x <400).collect(Collectors.toList());
		System.out.println(listwithpredicateAND);//[12, 33, 500] //[12, 33]
		
		
		
		
		
				

		
	}
}
