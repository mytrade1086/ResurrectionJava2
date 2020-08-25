package mainjava2;

public class Parent {
    private int bal;
	public String name;

	public Parent(int bal, String name) {
		this.bal = bal;
		this.name = name;
	}

	public void normalMethod() {
		System.out.println("this is normal method");

	}

	private void privateMethod() {
		System.out.println("this is private method");
	}

	public static void staticMethod() {
		System.out.println("this is static  method");
	}

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}

}
