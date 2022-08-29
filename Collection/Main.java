package OOPs.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(40);
        list2.add(90);
        list2.add(80);
        list2.add(70);

        System.out.println(list2);

        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(12);
        vector.add(78);
        vector.add(89);
        vector.add(46);
        System.out.println(vector);
    }
}
