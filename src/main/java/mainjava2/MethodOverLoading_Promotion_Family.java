package mainjava2;

public class MethodOverLoading_Promotion_Family {

	public static void main(String[] args) {

		// 1 Methods with same name but different parameters
		// 2 Return type does not matter
		
		
		//# 3 Note that in below example we passed char 'A' and we dont have any method accepting char.
		//So it jumped to same higher type within same family. i.e byte->short>chat->int
		
		
		MethodOverLoading_Promotion_Family ol=new MethodOverLoading_Promotion_Family();
		System.out.println(ol.area('A')); 
//		inside int arg
//		4225  ==============>65*65
		
	}

	public int  area(int arg1) {
		System.out.println("inside int arg");
		int area=arg1*arg1;
		return area;	
	}
	
	
	

	
	}


