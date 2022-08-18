import repository.MergeInteger;
import repository.ReadWriteFile;
import repository.SortInteger;
import repository.SortString;

import java.io.File;
import java.util.ArrayList;


public class Start {

    public static void main(String[] args) {
        args = new String[5];
        SortInteger sortInteger = new SortInteger();
        SortString sortString = new SortString();
        ReadWriteFile readWriteFile = new ReadWriteFile();
        args[0] = "-a";
        args[1] = "-i";
//        new Scanner(System.in).nextLine()
        args[2] = "-out.txt";
        args[3] = "src/main/in1.txt";
        args[4] = "src/main/in2.txt";
        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<String> s2 = new ArrayList<>();
        String string1 = args[0];
        String string2 = args[1];
        int i, b;
        if (string1.equals("-a")) {
            if (string2.equals("-s")) {
//                сортируем по возрастанию стринг
                b = 3;
                for (i = b; i<args.length; i++) {
                    ArrayList<String> s1 = readWriteFile.readFileString(new File(args[i]));
                    s2 = sortString.sortedAscending(s2, s1);
                }
                readWriteFile.writeFileString(s2, args[b-1]);
            }
            if (string2.equals("-i")) {
//                сортируем по возрастанию интеджер
//                b = 3;
//                for (i = b; i<args.length; i++) {
//                    ArrayList<Integer> a1 = readWriteFile.readFileInt(new File(args[i]));
//                    a2 = sortInteger.sortedAscending(a2, a1);
//                }
//                readWriteFile.writeFileInt(a2, args[b-1]);
                MergeInteger mergeInteger = new MergeInteger();
                mergeInteger.MergeAscending(new File(args[3]),new File(args[4]),new File(args[2]));


            }
        } else
        if (string1.equals("-d")) {
            if (string2.equals("-s")) {
//                сортируем по убыванию стринг
                b = 3;
                for (i = b; i<args.length; i++) {
                    ArrayList<String> s1 = readWriteFile.readFileString(new File(args[i]));
                    s2 = sortString.sortedDescending(s2, s1);
                }
                readWriteFile.writeFileString(s2, args[b-1]);
            }
            if (string2.equals("-i")) {
//                сортируем убыванию интеджер
                b = 3;
                for (i = b; i<args.length; i++) {
                    ArrayList<Integer> a1 = readWriteFile.readFileInt(new File(args[i]));
                    a2 = sortInteger.sortedDescending(a2, a1);
                }
                readWriteFile.writeFileInt(a2, args[b-1]);
            }
        } else
        if (string1.equals("-s")) {
//            сортируем по возрастанию стринги
            b = 2;
            for (i = b; i<args.length; i++) {
                ArrayList<String> s1 = readWriteFile.readFileString(new File(args[i]));
                s2 = sortString.sortedAscending(s2, s1);
            }
            readWriteFile.writeFileString(s2, args[b-1]);
        } else
        if (string1.equals("-i")) {
//            сортируем по возрастанию интежеры
            b = 2;
            for (i = b; i<args.length; i++) {
                ArrayList<Integer> a1 = readWriteFile.readFileInt(new File(args[i]));
                a2 = sortInteger.sortedAscending(a2, a1);
            }
            readWriteFile.writeFileInt(a2, args[b-1]);
        }
        else {
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
