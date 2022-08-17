package repository;

import java.util.ArrayList;

public class SortString {
    public ArrayList<String> sortedAscending(ArrayList<String> s1, ArrayList<String> s2) {
        int i = 0, j = 0;
        ArrayList<String> s3 = new ArrayList<>();
        while (i < s1.size() && j < s2.size()) {
            char[] s1Char = s1.get(i).toCharArray();
            char[] s2Char = s2.get(j).toCharArray();
            for (int s=0; s < s1Char.length || s< s2Char.length; s++) {
                if(s1Char[s] < s2Char[s]){
                    s3.add(s1.get(i));
                    i++;
                    break;
                } else if (s1Char[s] > s2Char[s]){
                    s3.add(s2.get(j));
                    j++;
                    break;
                }
            }
        }
        while (i < s1.size()) {
            if (s3.size() != 0) {
                char[] s1Char = s1.get(i).toCharArray();
                char[] s2Char = s3.get(s3.size() - 1).toCharArray();
                for (int s = 0; s < s1Char.length || s < s2Char.length; s++) {
                    if (s1Char[s] < s2Char[s]) {
                        i++;
                        break;
                    } else if (s1Char[s] > s2Char[s]) {
                        s3.add(s1.get(i++));
                        break;
                    }
                }
            } else {
                s3.add(s1.get(i++));
            }
        }
        while (j < s2.size()) {
            if (s3.size() != 0) {
                char[] s2Char = s2.get(j).toCharArray();
                char[] s3Char = s3.get(s3.size() - 1).toCharArray();
                for (int s = 0; s < s2Char.length || s < s3Char.length; s++) {
                    if (s2Char[s] < s3Char[s]) {
                        j++;
                        break;
                    } else if (s2Char[s] > s3Char[s]) {
                        s3.add(s2.get(j++));
                        break;
                    }
                }
            } else {
                s3.add(s2.get(j++));
            }
        }

        return s3;
    }
    public ArrayList<String> sortedDescending(ArrayList<String> s1, ArrayList<String> s2) {
        int i = 0, j = 0;
        ArrayList<String> s3 = new ArrayList<>();
        while (i < s1.size() && j < s2.size()) {
            char[] s1Char = s1.get(i).toCharArray();
            char[] s2Char = s2.get(j).toCharArray();
            for (int s=0; s < s1Char.length || s< s2Char.length; s++) {
                if(s1Char[s] > s2Char[s]){
                    s3.add(s1.get(i));
                    i++;
                    break;
                } else if (s1Char[s] < s2Char[s]){
                    s3.add(s2.get(j));
                    j++;
                    break;
                }
            }
        }
        while (i < s1.size()) {
            if (s3.size() != 0) {
                char[] s1Char = s1.get(i).toCharArray();
                char[] s2Char = s3.get(s3.size() - 1).toCharArray();
                for (int s = 0; s < s1Char.length || s < s2Char.length; s++) {
                    if (s1Char[s] > s2Char[s]) {
                        i++;
                        break;
                    } else if (s1Char[s] < s2Char[s]) {
                        s3.add(s1.get(i++));
                        break;
                    }
                }
            } else {
                s3.add(s1.get(i++));
            }
        }
        while (j < s2.size()) {
            if (s3.size() != 0) {
                char[] s2Char = s2.get(j).toCharArray();
                char[] s3Char = s3.get(s3.size() - 1).toCharArray();
                for (int s = 0; s < s2Char.length || s < s3Char.length; s++) {
                    if (s2Char[s] > s3Char[s]) {
                        j++;
                        break;
                    } else if (s2Char[s] < s3Char[s]) {
                        s3.add(s2.get(j++));
                        break;
                    }
                }
            } else {
                s3.add(s2.get(j++));
            }
        }
        return s3;
    }
}
