package FunctionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// Comparator is function interface not the comparable interface

public class FunctionalInterface_Compartor_Part1 {

    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();
        x.add(3);
        x.add(8);
        x.add(1);
        x.add(0);
        x.add(6);
        x.add(7);

        // This is the power of functional interafce to sort in decending order

        Collections.sort(x,(a,b)->b-a);

        System.out.println(x.toString());

        Set<Integer> s = new TreeSet<>((a,b)-> a-b);
        //Map<Integer,String> s = new TreeMap<>((a,b)-> a-b);
        s.add(2);
        s.add(3);
        s.add(1);
        s.add(0);
        System.out.println("after sorting" + s);
    }

}
