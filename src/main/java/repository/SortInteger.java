package repository;

import java.util.ArrayList;


public class SortInteger {
    ArrayList<Integer> a1 = new ArrayList<>();

    public ArrayList<Integer> getA1() {
        a1.add(1);
        a1.add(5);
        a1.add(10);


        return a2;
    }

    ArrayList<Integer> a2 = new ArrayList<>();

    public ArrayList<Integer> getA2() {
        a2.add(3);
        a2.add(5);
        a2.add(11);
        a2.add(15);
        a2.add(111);
        a2.add(26);
        return a2;
    }

    ArrayList<Integer> a3 = new ArrayList<>();
    int i = 0, j = 0, b = 0, a;

    public void sorted() {

        while (i < a1.size() && j < a2.size()) {
            a = a1.get(i) < a2.get(j) ? a1.get(i++) : a2.get(j++);
            if (a >= b) {
                a3.add(a);
                b = a3.get(a3.size() - 1);
            }

        }
        while (i < a1.size()) {
            if (a1.get(i) > a3.get(a3.size() - 1)) {
                a3.add(a1.get(i++));
            }
            else {
                i++;
            }
        }
        while (j < a2.size()) {
            if (a2.get(j) > a3.get(a3.size() - 1)) {
                a3.add(a2.get(j++));
            }
            else {
                j++;
            }
        }
            System.out.println(a3);
        }
    }
