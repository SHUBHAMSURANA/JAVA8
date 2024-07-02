package FunctionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FunctionalInterface_Compartor_Part2 implements Comparator<Integer>{

    @Override
    public
    int compare(Integer a, Integer b) {
        return b-a;
    }

    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();
        x.add(3);
        x.add(8);
        x.add(1);
        x.add(0);
        x.add(6);
        x.add(7);

        // This is the power of function interafce to sort in decending order
        Collections.sort(x, new FunctionalInterface_Compartor_Part2());
        System.out.println(x.toString());

    }
}
