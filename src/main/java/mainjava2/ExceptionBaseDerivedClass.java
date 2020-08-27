package mainjava2;


class Base extends Exception {} 
class Derived extends Base  {} 
public class ExceptionBaseDerivedClass { 
  public static void main(String args[]) { 
    try { 
       throw new Derived(); 
    } 
    catch(Base b) {} 
    catch(Derived d) {} //Unreachable catch block for Derived. It is already handled by the catch block for Base
    
    //to fix this, place  catch(Derived d) before catch
  } 
} 
