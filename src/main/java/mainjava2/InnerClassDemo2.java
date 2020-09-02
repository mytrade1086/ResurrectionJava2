package mainjava2;

public class InnerClassDemo2 {
	public static void main(String[] args) {
		Outer_t ot = new Outer_t();
		ot.print();
	}
}

class Outer_t {
	class Inner {
		public void one() {
			System.out.println("Printing inside One");
		}
	}

	public void print() {
		System.out.println("Calling print method of Outer class");
		Inner i = new Inner();
		i.one();
	}
}
