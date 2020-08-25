package mainjava2;
public class MethodOverRidingChild1 extends MethodOverRidingParent1  {
	//Method overriding is one of the way by which java achieve Run Time Polymorphism
	//#1 You can not override static method. Each class has static method at class level
	//#2 Parent P=new Child() can access overriding method present inside child class
	//#3 if method is not overridden , then P can only access methods inside Parent class
	//i.e P would never be able to access child class methods which are not overridden
	//4 Child C=new Parent()  This is not possible
	
	//5 You can increase the scope of method in child class but can't decrease it.
	//  i.e if Parent has protected.. Child can be public but not vice versa
	
	//6 private method as not visible in sub class can't be overridden. Similarly final methods also
	
	//7 We cant override constructor as each class constructor name is unique
	
	//8 The overriding method must have same return type (or subtype) ==>covariant return type
	
	
	public static void main(String[] args) {
		MethodOverRidingChild1 c1=new MethodOverRidingChild1();
		MethodOverRidingParent1 p1=new MethodOverRidingParent1();
		p1.area(10, 10);
		p1.normaMethod();
		MethodOverRidingParent1.mystatic();
	    
		System.out.println("Separator====================");
		MethodOverRidingParent1 p2= new MethodOverRidingChild1();
		p2.area(10, 100);//#2
		p2.normaMethod();	
	  //p2.normaChildMethod();//#3 
		c1.area(10, 1000);
		c1.normaMethod(); //c1 can access inherited method
		mystatic();// if two static method of same name then mystatic would call child class method
		
	}

	@Override
	public float area(int breadth, int length) {
		float area=(float)3.14*breadth*length;
		System.out.println("this is  method in child class. Area is"+area);
		return area;
	}
	//@Override //We can't override static method
	public static void mystatic() {
		System.out.println("Static method in Child");
	}
	
	public void normaChildMethod() {
		System.out.println("Normal Method Inside Child");
	}

	

}
