package mainjava2;

import java.util.function.Function;

public class FunctionTR {
	public static void main(String[] args) {
		
		//#1 apply method
		Function<String, Integer> func = StringValue -> StringValue.length();
		System.out.println(func.apply("myname")); //6
		
		//#1 andThen method
		Function<Integer, Integer> func2 = intValue -> intValue*2;
		System.out.println(func.andThen(func2).apply("loveis"));//12
		
		
		
	}

}
