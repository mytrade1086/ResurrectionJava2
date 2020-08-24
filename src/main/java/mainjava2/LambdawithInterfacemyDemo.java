package mainjava2;

public class LambdawithInterfacemyDemo {

	public static void main(String[] args) {
		ImyDemo d1 = new ImyDemo() {
			@Override
			public void printWebsite(String website) {
				System.out.println("Website is " + website);
			}
		};	
		d1.printWebsite("Facebook");
		d1.printWebsite("Google");		
	}
	
}


