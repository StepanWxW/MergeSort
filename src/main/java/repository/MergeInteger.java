package repository;

import java.io.*;

public class MergeInteger {

    public void MergeAscending(File fileName1, File fileName2, File fileName3) {
        try (BufferedReader br1 = new BufferedReader(new FileReader(fileName1));
             BufferedReader br2 = new BufferedReader(new FileReader(fileName2));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName3))) {
            String line1 = br1.readLine();
            String line2 = br2.readLine();
            Integer int1 = null;
            Integer int2 = null;
            int1 = checkForNullAsc(line1, int1, int2, writer, br1, br2);
            int2 = checkForNullAsc(line2, int2, int1, writer, br2, br1);

            while (int1 != null && int2 != null) {
                while (int1 != null && int1 <= int2) {
                    writer.write(int1 + "\n");
                    writer.flush();
                    String line11 = br1.readLine();
                    int1 = checkForNullAsc(line11, int1, int2, writer, br1, br2);
                }
                while ((int2) != null && (int1) != null && int1 > int2) {
                    writer.write(int2 + "\n");
                    writer.flush();
                    String line22 = br2.readLine();
                    int2 = checkForNullAsc(line22, int2, int1, writer, br2, br1);
                }
            }
        } catch (IOException e) {
            System.out.println("Problem with files");
        }
    }

    private Integer checkForNullAsc(String line1, Integer int1, Integer int2, BufferedWriter writer, BufferedReader br1, BufferedReader br2) throws IOException {
        try {
            if (line1 != null) {
                while (line1.contains(" ")) {
                    line1 = br1.readLine();
                }
                Integer in1False = Integer.valueOf(line1);
                if (int1 != null) {
                    while (in1False < int1 || line1.contains(" ")) {
                        line1 = br1.readLine();
                        in1False = Integer.valueOf(line1);
                    }
                }
                int1 = in1False;

            } else {
                while ((int2) != null) {
                    writer.write(int2 + "\n");
                    writer.flush();
                    String line22 = br2.readLine();
                    if (line22 != null) {
                        while (line22.contains(" ")) {
                            line22 = br2.readLine();
                        }
                        Integer in2False = Integer.valueOf(line22);
                        while (in2False < int2 || line22.contains(" ")) {
                            line22 = br2.readLine();
                            in2False = Integer.valueOf(line22);
                        }
                        int2 = in2False;
                    } else
                        int2 = null;
                    int1 = null;
                }
            }
            return int1;
        } catch (NumberFormatException e) {
            System.out.println("Please enter file with integer. The program will not exit correctly.");
        }
        return null;
    }

    public void MergeDescending(File fileName1, File fileName2, File fileName3) {
        try (BufferedReader br1 = new BufferedReader(new FileReader(fileName1));
             BufferedReader br2 = new BufferedReader(new FileReader(fileName2));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName3))) {
            String line1 = br1.readLine();
            String line2 = br2.readLine();
            Integer int1 = null;
            Integer int2 = null;
            int1 = checkForNullDes(line1, int1, int2, writer, br1, br2);
            int2 = checkForNullDes(line2, int2, int1, writer, br2, br1);

            while (int1 != null && int2 != null) {
                while (int1 != null && int1 >= int2) {
                    writer.write(int1 + "\n");
                    writer.flush();
                    String line11 = br1.readLine();
                    int1 = checkForNullDes(line11, int1, int2, writer, br1, br2);
                }
                while ((int2) != null && (int1) != null && int1 < int2) {
                    writer.write(int2 + "\n");
                    writer.flush();
                    String line22 = br2.readLine();
                    int2 = checkForNullDes(line22, int2, int1, writer, br2, br1);
                }
            }
        } catch (IOException e) {
            System.out.println("Problem with files");
        }
    }

    private Integer checkForNullDes(String line1, Integer int1, Integer int2, BufferedWriter writer, BufferedReader br1, BufferedReader br2) throws IOException {
        try {
            if (line1 != null) {
                while (line1.contains(" ")) {
                    line1 = br1.readLine();
                }
                Integer in1False = Integer.valueOf(line1);
                if (int1 != null) {
                    while (in1False > int1 || line1.contains(" ")) {
                        line1 = br1.readLine();
                        in1False = Integer.valueOf(line1);
                    }
                }
                int1 = in1False;

            } else {
                while ((int2) != null) {
                    writer.write(int2 + "\n");
                    writer.flush();
                    String line22 = br2.readLine();
                    if (line22 != null) {
                        while (line22.contains(" ")) {
                            line22 = br2.readLine();
                        }
                        Integer in2False = Integer.valueOf(line22);
                        while (in2False > int2 || line22.contains(" ")) {
                            line22 = br2.readLine();
                            in2False = Integer.valueOf(line22);
                        }
                        int2 = in2False;
                    } else
                        int2 = null;
                    int1 = null;
                }
            }
            return int1;
        } catch (NumberFormatException e) {
            System.out.println("Please enter file with integer. The program will not exit correctly.");
        }
        return null;
    }

}

