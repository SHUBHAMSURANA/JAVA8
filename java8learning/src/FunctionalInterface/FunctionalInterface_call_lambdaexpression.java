package FunctionalInterface;
// if we inherit then we cannot use lambda function
// public class FunctionalInterface_call_lambdaexpression implements FunctionalInterface_Interface{   
public class FunctionalInterface_call_lambdaexpression {
    public static void main(String[] args) {
        FunctionalInterface_Interface a = ()->"Function interface merthod call";
        System.err.println(a.getName());
        FunctionalInterface_Interface c = ()->" reuse the Function interface merthod call";
        System.err.println(c.getName());
        // test the git commint
        //FFGFG
    }
}
