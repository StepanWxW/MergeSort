package repository;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class OpenFile {
    public ArrayList<Integer> getFile(File fileName) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(fileName);
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                if (!Objects.equals(s, "")) {
                    Integer line = Integer.valueOf(s);
                    arrayList.add(line);
                } else System.out.println("The file has an empty line");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't open file" + e);
        }
        return arrayList;
    }
}
