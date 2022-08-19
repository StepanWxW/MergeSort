package repository;

import java.io.*;

public class MergeString {

    public void MergeAscending(File fileName1, File fileName2, File fileName3) {
        try (BufferedReader br1 = new BufferedReader(new FileReader(fileName1));
             BufferedReader br2 = new BufferedReader(new FileReader(fileName2));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName3))) {

            char[] line1Char = conversion(br1.readLine(), br1);
            char[] line2Char = conversion(br2.readLine(), br2);

            checkForNullAsc(line2Char, line1Char, writer, br2);
            checkForNullAsc(line1Char, line2Char, writer, br1);

            while (line1Char != null && line2Char != null) {
                while (compareAsc(line2Char, line1Char)) { /// сравниваем первый и массив второй, какой больше, если первый то тру.
                    writer.write(String.valueOf(line1Char) + "\n");
                    writer.flush();
                    char[] line1CharCheck = conversion(br1.readLine(), br1);
                    while (compareAsc(line1Char, line1CharCheck)) { // делаем проверку, с уже записсанными данными
                        line1CharCheck = conversion(br1.readLine(), br1);
                    }
                    line1Char = line1CharCheck;
                    checkForNullAsc(line2Char,line1Char,writer,br2);
                }
                while (compareAsc(line1Char, line2Char)) {
                    writer.write(String.valueOf(line2Char) + "\n");
                    writer.flush();
                    char[] line2CharCheck = conversion(br2.readLine(), br2);
                    while (compareAsc(line2Char, line2CharCheck)) { // делаем проверку, с уже записсанными данными
                        line2CharCheck = conversion(br2.readLine(), br2);
                    }
                    line2Char = line2CharCheck;
                    checkForNullAsc(line1Char,line2Char,writer,br1);
                }
            }
        } catch (IOException e) {
            System.out.println(e);;
        }
    }
    private boolean compareAsc(char[] on1, char[] on2) {
        if (on1 == null) return false;
        if (on2 == null) return false;
        for (int s = 0; s < on1.length || s < on2.length; s++) {
            if (on1 [s] > on2 [s]) {
                return true;
            } else if (on1 [s] < on2 [s]) {
                return false;
            }
        }
        return true;
    }
    private char[] conversion(String s, BufferedReader br) throws IOException {
        if (s == null) {
            return null;
        }
        while (s.contains(" ")) {
            s = br.readLine();
            if (s == null) {
                return null;
            }
        }
        return s.toCharArray();
    }
    private void checkForNullAsc(char[] line1, char[] line2, BufferedWriter writer, BufferedReader br) throws IOException {
        if (line2 == null) {
            while (line1 != null) {
                writer.write(String.valueOf(line1) +"\n");
                writer.flush();
                char[] line1CharCheck = conversion(br.readLine(), br);
                while (compareAsc(line1, line1CharCheck)) {
                    line1CharCheck = conversion(br.readLine(), br);
                }
                line1 = line1CharCheck;
            }
        }
    }
    public void MergeDescending(File fileName1, File fileName2, File fileName3) {
        try (BufferedReader br1 = new BufferedReader(new FileReader(fileName1));
             BufferedReader br2 = new BufferedReader(new FileReader(fileName2));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName3))) {

            char[] line1Char = conversion(br1.readLine(), br1);
            char[] line2Char = conversion(br2.readLine(), br2);

            checkForNullDes(line2Char, line1Char, writer, br2);
            checkForNullDes(line1Char, line2Char, writer, br1);

            while (line1Char != null && line2Char != null) {
                while (compareDes(line2Char, line1Char)) { /// сравниваем первый и массив второй, какой больше, если первый то тру.
                    writer.write(String.valueOf(line1Char) + "\n");
                    writer.flush();
                    char[] line1CharCheck = conversion(br1.readLine(), br1);
                    while (compareDes(line1Char, line1CharCheck)) { // делаем проверку, с уже записсанными данными
                        line1CharCheck = conversion(br1.readLine(), br1);
                    }
                    line1Char = line1CharCheck;
                    checkForNullDes(line2Char,line1Char,writer,br2);
                }
                while (compareDes(line1Char, line2Char)) {
                    writer.write(String.valueOf(line2Char) + "\n");
                    writer.flush();
                    char[] line2CharCheck = conversion(br2.readLine(), br2);
                    while (compareDes(line2Char, line2CharCheck)) { // делаем проверку, с уже записсанными данными
                        line2CharCheck = conversion(br2.readLine(), br2);
                    }
                    line2Char = line2CharCheck;
                    checkForNullDes(line1Char,line2Char,writer,br1);
                }
            }
        } catch (IOException e) {
            System.out.println(e);;
        }
    }
    private void checkForNullDes(char[] line1, char[] line2, BufferedWriter writer, BufferedReader br) throws IOException {
        if (line2 == null) {
            while (line1 != null) {
                writer.write(String.valueOf(line1) +"\n");
                writer.flush();
                char[] line1CharCheck = conversion(br.readLine(), br);
                while (compareDes(line1, line1CharCheck)) {
                    line1CharCheck = conversion(br.readLine(), br);
                }
                line1 = line1CharCheck;
            }
        }
    }
    private boolean compareDes(char[] on1, char[] on2) {
        if (on1 == null) return false;
        if (on2 == null) return false;
        for (int s = 0; s < on1.length || s < on2.length; s++) {
            if (on1 [s] < on2 [s]) {
                return true;
            } else if (on1 [s] > on2 [s]) {
                return false;
            }
        }
        return true;
    }
}


