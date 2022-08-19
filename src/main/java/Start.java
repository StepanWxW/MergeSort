import repository.MergeInteger;
import repository.ReadWriteFile;
import repository.SortInteger;
import repository.SortString;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


public class Start {

    public static void main(String[] args) {
        args = new String[7];
        MergeInteger mergeInteger = new MergeInteger();
        args[0] = "-a";
        args[1] = "-i";
        args[2] = "-out.txt";
        args[3] = "src/main/in1.txt";
        args[4] = "src/main/in2.txt";
        args[5] = "src/main/in3.txt";
        args[6] = "src/main/in3.txt";
        String string1 = args[0];
        String string2 = args[1];
        int b = 1;
        if (string1.equals("-a")) {
            b++;
            if (string2.equals("-s")) {
//                сортируем по возрастанию стринг

                if (string2.equals("-i")) {
//                сортируем по возрастанию интеджер
                    b++;
                    String fileName = args[b - 1];
                    mergeInteger.MergeAscending(new File(args[b]), new File(args[b + 1]), new File(fileName));
                    for (int j = b + 2; j < args.length; j++) {
                        mergeInteger.MergeAscending(new File(fileName), new File(args[j]), new File("1.txt"));
                        try {
                            Files.delete(Paths.get(fileName));
                        } catch (IOException e) {
                            System.out.println("Problem with delete file" + e);;
                        }
                        new File("1.txt").renameTo(new File(fileName));
                    }
                } else if (string1.equals("-d")) {
                    b++;
                    if (string2.equals("-s")) {
                        b++;
//                сортируем по убыванию стринг

                    }
                    if (string2.equals("-i")) {
//                сортируем убыванию интеджер
                        b++;

                    }
                } else if (string1.equals("-s")) {
//            сортируем по возрастанию стринги
                    b++;

                } else if (string1.equals("-i")) {
//            сортируем по возрастанию интежеры
                    b++;

                } else {
                    System.out.println("Please enter in order:" +
                            "\n1.) \"-a\" - ascending sort, \"-d\" - descending sort  (This parameter is optional, the default is ascending)" +
                            "\n2.) \"-s\" - string sorting, \"-i\" - integer sorting" +
                            "\n3.) \"-out.txt\" - name of the created file." +
                            "\n4.) \"-in.txt\" - name readable filename. There may be several in a row." +
                            "\nFor example: " +
                            "-a -s -out.txt -in1.txt -in2.txt -in3.txt");
                }
            }
        }
    }
}
