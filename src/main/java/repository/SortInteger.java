package repository;

import java.util.ArrayList;


public class SortInteger {

    public ArrayList<Integer> sorted(ArrayList<Integer> a1, ArrayList<Integer> a2) {
        int i = 0, j = 0, b = 0, a;
        ArrayList<Integer> a3 = new ArrayList<>();
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
            return a3;
        }
    }
