package repository;

import java.util.Arrays;

import static java.lang.System.arraycopy;

public class SortInteger {
    int[] a1 = new int[]{1,3,5,10,11,25};
    int[] a2 = new int[]{2,4,1,9,3,22};
    int[] a3 = new int[a1.length + a2.length];
    int i=0, j=0, k = 0, b =0, a;
    public void sorted() {
        while (i < a1.length && j < a2.length) {
            a = a1[i] < a2[j] ? a1[i++] : a2[j++];
            if (a > b) {
                a3[k++] = a;
            }
            b = a;
        }
        if (i < a1.length) {
            arraycopy(a1, i, a3, k, a1.length - i);
        } else if (j < a2.length) {
            arraycopy(a2, j, a3, k, a2.length - j);
        }
        System.out.println(Arrays.toString(a3));
    }
}
