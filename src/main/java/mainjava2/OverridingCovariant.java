package mainjava2;

class A {
	A get() {
		return this;
	}
}

class B1 extends A {
	B1 get() {
		return this;
	}

	void message() {
		System.out.println("welcome to covariant return type");
	}
}
	
	class OverridingCovariant{

	public static void main(String args[]) {
		new B1().get().message(); //welcome to covariant return type
	}
}