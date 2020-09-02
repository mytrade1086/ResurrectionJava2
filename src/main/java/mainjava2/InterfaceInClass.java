package mainjava2;

public class InterfaceInClass implements main.Itest {
public static void main(String[] args) {
	InterfaceInClass ic=new InterfaceInClass();
	ic.demo();
	}

@Override
public  void demo() {

	System.out.println("Inherited from Interface");
	
}



}


class main{
	
	public interface Itest {
		
		public void demo();
		
	}
	
}