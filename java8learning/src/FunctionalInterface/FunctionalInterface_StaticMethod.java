package FunctionalInterface;

/**
 * A
 */
@FunctionalInterface
interface A {
    String getName();
    static void sayHello() {
        System.err.println("helooo!!");
    }
    default void show()
    {
        System.out.println("Default PI1");
    }
}

public class FunctionalInterface_StaticMethod implements A {
    // This below methods will not be overriden as yeah ek naya method hai FunctionalInterface_StaticMethod class ke liye 
    static void sayHello() {
        System.err.println("helooo static wala!!");
    }
    
    @Override
    public
    String getName() {
        return "haimn";
    }

    public static void main(String args[])
    {
        FunctionalInterface_StaticMethod t = new FunctionalInterface_StaticMethod();
        t.show();

        
        System.out.println(t.getName());
        sayHello();
        A.sayHello();

    }    
}

//output
//haimn
//Default PI1
//helooo static wala!!
//helooo!!