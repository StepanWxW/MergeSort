import directory.MainDirectory;
import repository.MergingInteger;
import repository.MergingString;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Start {

    public static void main(String[] args) {
        String string1 = "", string2 = "";
        try {
            string1 = args[0];
            string2 = args[1];
        
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
        } else {
            System.out.println(MainDirectory.RULE);
        }
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Information is not correct.");
    }
    }

    private static void getAscendingString(int b, String args[]) {
        MergingString mergingString = new MergingString();
        b++;
        String fileOutName = args[b - 1];
        String tempFile = "tempFile.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.flush();
        } catch (IOException e) {
            System.out.println("Problem creating temporary file");
        }
        mergingString.mergeAscending(new File(args[b]), new File(tempFile), new File(fileOutName));
        for (int j = b + 1; j < args.length; j++) {
            mergingString.mergeAscending(new File(fileOutName), new File(args[j]), new File(tempFile));
            new File(fileOutName).delete();
            new File(tempFile).renameTo(new File(fileOutName));
        }
        new File(tempFile).delete();
    }

    private static void getAscendingInteger(int b, String args[]) {
        MergingInteger mergingInteger = new MergingInteger();
        b++;
        String fileOutName = args[b - 1];
        String tempFile = "tempFile.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.flush();
        } catch (IOException e) {
            System.out.println("Problem creating temporary file");
        }
        mergingInteger.mergeAscending(new File(args[b]), new File(tempFile), new File(fileOutName));
        for (int j = b + 1; j < args.length; j++) {
            mergingInteger.mergeAscending(new File(fileOutName), new File(args[j]), new File(tempFile));
            new File(fileOutName).delete();
            new File(tempFile).renameTo(new File(fileOutName));
        }
        new File(tempFile).delete();
    }

    private static void getDescendingString(int b, String args[]) {
        MergingString mergingString = new MergingString();
        b++;
        String fileOutName = args[b - 1];
        String tempFile = "tempFile.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.flush();
        } catch (IOException e) {
            System.out.println("Problem creating temporary file");
        }
        mergingString.mergeDescending(new File(args[b]), new File(tempFile), new File(fileOutName));
        for (int j = b + 1; j < args.length; j++) {
            mergingString.mergeDescending(new File(fileOutName), new File(args[j]), new File(tempFile));
            new File(fileOutName).delete();
            new File(tempFile).renameTo(new File(fileOutName));
        }
        new File(tempFile).delete();
    }

    private static void getDescendingInteger(int b, String args[]) {
        MergingInteger mergingInteger = new MergingInteger();
        b++;
        String fileOutName = args[b - 1];
        String tempFile = "tempFile.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.flush();
        } catch (IOException e) {
            System.out.println("Problem creating temporary file");
        }
        mergingInteger.mergeDescending(new File(args[b]), new File(tempFile), new File(fileOutName));
        for (int j = b + 1; j < args.length; j++) {
            mergingInteger.mergeDescending(new File(fileOutName), new File(args[j]), new File(tempFile));
            new File(fileOutName).delete();
            new File(tempFile).renameTo(new File(fileOutName));
        }
        new File(tempFile).delete();
    }
}
