package mainjava2;

import java.util.function.Consumer;

public class ConsumerDemo {

	//returns nothing .Takes something
	// void accept(T t)
	
	public static void main(String[] args) {
		Consumer<String> cons=x->System.out.println(x);
		//Consumer<String> cons2=x->x+1; // void methods cant return a value
		cons.accept("Sumit");
	}
}
