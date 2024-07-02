package FunctionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FunctionalInterface_Compartor_Part3 {

    public static void main(String[] args) {
        Student a = new Student(3, "abs", "uiy");
        Student b = new Student(1, "ae", "poi");
        Student c = new Student(2, "zxc", "tyu");
        Student d = new Student(9, "poi", "oiu");

        List<Student> x = new ArrayList<>();
        x.add(a);
        x.add(b);
        x.add(c);
        x.add(d);
        
        Collections.sort(x, (t,u) -> t.rollnumber-u.rollnumber);
        System.out.println(x);

        Collections.sort(x, (t,u) -> t.name.compareTo(u.name));
        System.out.println(x);
    }

}
