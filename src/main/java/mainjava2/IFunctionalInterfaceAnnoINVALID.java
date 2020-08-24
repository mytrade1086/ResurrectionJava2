package mainjava2;

@FunctionalInterface
public interface IFunctionalInterfaceAnnoINVALID {
public void name();
public void name2();
//# Its valid to have @functionaInterface when we have only one abstract method
//# HERE WE HAVE 2 , HENCE THE ERROR
//# When we add one more abstract method, we will see error
//# we can use default,static without error

}