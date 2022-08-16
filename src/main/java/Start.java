import repository.SortInteger;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {
        SortInteger sortInteger = new SortInteger();
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(5);
        a1.add(10);
        a1.add(14);
        a1.add(10);
        a1.add(18);
        a1.add(22);
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(3);
        a2.add(5);
        a2.add(11);
        a2.add(15);
        a2.add(111);
        a2.add(26);
        System.out.println(sortInteger.sorted(a1, a2));

    }
}
