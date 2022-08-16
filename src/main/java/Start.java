import repository.OpenFile;
import repository.SortInteger;

import java.io.File;
import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {
        SortInteger sortInteger = new SortInteger();
        OpenFile openFile = new OpenFile();
        ArrayList<Integer> a1 = openFile.openFile(new File("src/main/resources/in1.txt"));
        ArrayList<Integer> a2 = openFile.openFile(new File("src/main/resources/in2.txt"));
        System.out.println(sortInteger.sorted(a1, a2));

    }
}
