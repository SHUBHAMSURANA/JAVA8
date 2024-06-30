package FunctionalInterface;

//Invalid '@FunctionalInterface' annotation; MyInterface is not a functional interface because of two   abstract methods
//A functional interface is an interface that contains only one abstract method. 

@FunctionalInterface
public interface FunctionalInterface_Error {
  //  public void sayHello();
    public void test();
}
