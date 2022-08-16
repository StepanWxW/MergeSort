package repository;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class OpenFile {
    public ArrayList<Integer> openFile(File fileName) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(fileName);
            while (scanner.hasNextLine()) {
                Integer line = Integer.valueOf(scanner.nextLine());
                arrayList.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't open file" + e);
        }
        return arrayList;
    }
}
