package mainjava2;

import java.util.function.Supplier;

public class SupplierDemo {

	// takes nothing but returns something.
	// T get()
	// Ex: LocalDate::now , Instance::now

	public static void main(String[] args) {
		gettext(()->"sumit");   //0 arguments but returns something
		gettext(()->"neha");
		gettext(()->"raj");
	}

	public static void gettext(Supplier<String> name) {
		System.out.println(name.get());
		System.out.println(name.get().length());
		
	}
}
