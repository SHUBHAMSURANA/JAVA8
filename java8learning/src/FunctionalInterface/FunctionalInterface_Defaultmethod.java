package FunctionalInterface;
// Interface 1
interface PI1 {
    // Default method
    default void show()
    {
        System.out.println("Default PI1");
    }
}
 
// Interface 2
interface PI2 {
    // Default method
    default void show()
    {
        System.out.println("Default PI2");
    }
}

public class FunctionalInterface_Defaultmethod implements PI1, PI2 {
    public static void main(String args[])
    {
        FunctionalInterface_Defaultmethod t = new FunctionalInterface_Defaultmethod();
        t.show();
    }    

    @Override
    public void show() {
        PI1.super.show();
    }
}


