package repository;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ReadWriteFile {
    public ArrayList<Integer> readFileInt(File fileName) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(fileName);
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                if (!Objects.equals(s, "")) {
                    if(!s.contains(" ")) {
                        Integer line = Integer.valueOf(s);
                        arrayList.add(line);
                    }
                        else {
                            System.out.println("File: " + fileName + " contains an empty character." +
                                    " This line has not been taken into account.");
                        }
                } else System.out.println("The file " +fileName + " has an empty line. ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't open file" + e);
        }
        return arrayList;
    }
    public ArrayList<String> readFileString(File fileName) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(fileName);
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                if (!Objects.equals(s, "")) {
                    if(!s.contains(" ")) {
                        arrayList.add(s);
                    } else {
                        System.out.println("File: " + fileName + " contains an empty character." +
                                " This line has not been taken into account.");
                    }
                } else System.out.println("The file has an empty line");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't open file" + e);
        }
        return arrayList;
    }
    public ArrayList<Integer> writeFileInt(ArrayList<Integer> a2, String args) {
        String argsClean = args.replaceAll("-", "");
        try (PrintWriter pw = new PrintWriter(new FileOutputStream(argsClean, false))) {
            for (int a : a2) {
                pw.println(a);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return a2;
    }
    public ArrayList<String> writeFileString(ArrayList<String> s2, String args) {
        String argsClean = args.replaceAll("-", "");
        try (PrintWriter pw = new PrintWriter(new FileOutputStream(argsClean, false))) {
            for (String s : s2) {
                pw.println(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return s2;
    }

}
