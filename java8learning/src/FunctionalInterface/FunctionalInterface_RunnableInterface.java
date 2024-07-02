package FunctionalInterface;

public class FunctionalInterface_RunnableInterface {
    public static void main(String[] args) {
        Runnable t = () -> {
            for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }};
        Thread x= new Thread(t);
        x.run();
    }
}
