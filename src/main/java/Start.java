import repository.OpenFile;
import repository.SortInteger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Start {

    public static void main(String[] args) {
        args = new String[4];
        SortInteger sortInteger = new SortInteger();
        OpenFile openFile = new OpenFile();
        args[0] = "-i";
        args[1] = "src/main/out.txt";
        args[2] = "src/main/in1.txt";
        args[3] = "src/main/in2.txt";
        ArrayList<Integer> a2 = new ArrayList<>();
        int i;
        int b = 0;
        switch (args[0]) {
            case ("-a"):
            case ("-d"):
                b = 3;
                break;
            case ("-s"):
            case ("-i"):
                b = 2;
                for (i = b; i<args.length; i++) {
                    ArrayList<Integer> a1 = openFile.getFile(new File(args[i]));
                    a2 = sortInteger.sorted(a2, a1);
                }
                break;
            default:
                System.out.println("Please enter the first parameter is: '-a','-d','-s' or '-i'");
        }
        try (PrintWriter pw = new PrintWriter(new FileOutputStream(args[b-1], true))) {
            for (int a : a2) {
                pw.println(a);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }
}
