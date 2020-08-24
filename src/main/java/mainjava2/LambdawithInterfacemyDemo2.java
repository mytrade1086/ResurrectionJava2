package mainjava2;

public class LambdawithInterfacemyDemo2 {

	public static void main(String[] args) {
		
		//1 Using Lambda for with Variable Type
		ImyDemo d1 =(String value)->{
			try {
				Thread.sleep(2000);
				System.err.println("###############SEPARATOR 1 ####################");
				System.out.println("Hi "+value);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		d1.printWebsite("withStringType");
		
		
		//2 Using Lambda for without Variable Type
		ImyDemo d2 =(value)->{
			try {
				Thread.sleep(2000);
				System.err.println("###############SEPARATOR2 ####################");
				System.out.println("Hi "+value);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
			
		};
	
		d2.printWebsite("noType");
	}
	
}


