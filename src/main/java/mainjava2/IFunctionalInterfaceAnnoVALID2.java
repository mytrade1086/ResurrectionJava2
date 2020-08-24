package mainjava2;

@FunctionalInterface
public interface IFunctionalInterfaceAnnoVALID2 {
public void name();
default void test() {
System.out.println("this is default method");
}

static void test2() {
System.out.println("this is static method");
}
//# Its valid to have @functionaInterface when we have only one abstract method
//# When we add one more abstract method, we will see error
// # we can use default,static without error

}