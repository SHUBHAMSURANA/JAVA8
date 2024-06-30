package FunctionalInterface;

public class FunctionalInterface_call_lambdaexpression {
    public static void main(String[] args) {
        FunctionalInterface_Interface a = ()->"Function interface merthod call";
        System.err.println(a.getName());
        FunctionalInterface_Interface c = ()->" reuse the Function interface merthod call";
        System.err.println(c.getName());
    }
}
