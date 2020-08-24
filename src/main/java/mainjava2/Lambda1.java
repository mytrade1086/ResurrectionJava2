package mainjava2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Lambda1 {

	public static void main(String[] args) throws InterruptedException {

		ArrayList<String> names = new ArrayList<String>();
     	names.add("Amit");
		names.add("Sagar");
		names.add("Neha");
		names.add("Lover");

		// 1 Looping names with lambda
		names.forEach(name -> System.out.println(name));
		Thread.sleep(2000);
		System.err.println("###############SEPARATOR####################");

		// 2 Finding names on Condition ( where we have "a")
		names.forEach(name -> {
			if (name.contains("a")) {
				System.out.println(name);
			}
		});

		Thread.sleep(2000);
		System.err.println("###############SEPARATOR2####################");

		// 3 Consumer interface to store a lambda expression in a variable
		Consumer<String> method = (n) -> {
			System.out.println(n);
		};
		names.forEach(method);
	}

}
