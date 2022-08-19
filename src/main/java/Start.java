import repository.MergeInteger;
import repository.MergeString;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Start {

    public static void main(String[] args) {
        args = new String[5];
        args[0] = "-d";
        args[1] = "-i";
        args[2] = "-out.txt";
        args[3] = "src/main/1in1.txt";
        args[4] = "src/main/1in2.txt";
        String string1 = args[0];
        String string2 = args[1];
        int b = 1;
        if (string1.equals("-a")) {
            b++;
            if (string2.equals("-s")) {
                getAscendingString(b, args);
            }
            if (string2.equals("-i")) {
                getAscendingInteger(b, args);
            }
        } else if (string1.equals("-d")) {
            b++;
            if (string2.equals("-s")) {
                getDescendingString(b, args);
            }
            if (string2.equals("-i")) {
            getDescendingInteger(b, args);
            }
        } else if (string1.equals("-s")) {
            getAscendingString(b, args);
        } else if (string1.equals("-i")) {
            getAscendingInteger(b, args);
        } else {    System.out.println("Please enter in order:" +
                            "\n1.) \"-a\" - ascending sort, \"-d\" - descending sort  (This parameter is optional, the default is ascending)" +
                            "\n2.) \"-s\" - string sorting, \"-i\" - integer sorting" +
                            "\n3.) \"-out.txt\" - name of the created file." +
                            "\n4.) \"-in.txt\" - name readable filename. There may be several in a row." +
                            "\nFor example: " +
                            "-a -s -out.txt -in1.txt -in2.txt -in3.txt");
                }
            }
            private static void getAscendingString(int b, String args[]){
                MergeString mergeString = new MergeString();
                b++;
                String fileName = args[b - 1];
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("1.txt"))) {
                    writer.flush();
                } catch (IOException e) {
                    System.out.println("Problem creating temporary file");
                }
                mergeString.MergeAscending(new File(args[b]), new File("1.txt"), new File(fileName));
                for (int j = b + 1; j < args.length; j++) {
                    mergeString.MergeAscending(new File(fileName), new File(args[j]), new File("1.txt"));
                    new File(fileName).delete();
                    new File("1.txt").renameTo(new File(fileName));
                }
                new File("1.txt").delete();
            }
            private static void getAscendingInteger(int b, String args[]){
                MergeInteger mergeInteger = new MergeInteger();
                b++;
                String fileName = args[b - 1];
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("1.txt"))) {
                    writer.flush();
                } catch (IOException e) {
                    System.out.println("Problem creating temporary file");
                }
                mergeInteger.MergeAscending(new File(args[b]), new File("1.txt"), new File(fileName));
                for (int j = b + 1; j < args.length; j++) {
                    mergeInteger.MergeAscending(new File(fileName), new File(args[j]), new File("1.txt"));
                    new File(fileName).delete();
                    new File("1.txt").renameTo(new File(fileName));
                }
                new File("1.txt").delete();
            }
            private static void getDescendingString(int b, String args[]) {
                MergeString mergeString = new MergeString();
                b++;
                String fileName = args[b - 1];
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("1.txt"))) {
                    writer.flush();
                } catch (IOException e) {
                    System.out.println("Problem creating temporary file");
                }
                mergeString.MergeDescending(new File(args[b]), new File("1.txt"), new File(fileName));
                for (int j = b + 1; j < args.length; j++) {
                    mergeString.MergeDescending(new File(fileName), new File(args[j]), new File("1.txt"));
                    new File(fileName).delete();
                    new File("1.txt").renameTo(new File(fileName));
                }
                new File("1.txt").delete();
            }
            private static void getDescendingInteger(int b, String args[]) {
                MergeInteger mergeInteger = new MergeInteger();
                b++;
                String fileName = args[b - 1];
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("1.txt"))) {
                    writer.flush();
                } catch (IOException e) {
                    System.out.println("Problem creating temporary file");
                }
                mergeInteger.MergeDescending(new File(args[b]), new File("1.txt"), new File(fileName));
                for (int j = b + 1; j < args.length; j++) {
                    mergeInteger.MergeDescending(new File(fileName), new File(args[j]), new File("1.txt"));
                    new File(fileName).delete();
                    new File("1.txt").renameTo(new File(fileName));
                }
                new File("1.txt").delete();
            }
        }
