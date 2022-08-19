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
            if (line1 != null) { //проверка на пустой файл
                int1 = Integer.parseInt(line1);
            } else { // файл пуст то этот код копируем второй файл
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
            if (line2 != null) { // проверяем второй файл на пустоту
                int2 = Integer.parseInt(line2);
            } else {
                while ((int1) != null) {
                    writer.write(int1 + "\n");
                    writer.flush();
                    String line11 = br1.readLine();
                    if (line11 != null) {
                        while (line11.contains(" ")) {
                            line11 = br1.readLine();
                        }
                        Integer in1False = Integer.valueOf(line11);
                        while (in1False < int1 || line11.contains(" ")) {
                            line11 = br1.readLine();
                            in1False = Integer.valueOf(line11);
                        }
                        int1 = in1False;
                    } else
                        int1 = null;
                    int2 = null;
                }
            }
            // пошло основное действие.
            while (int1 != null || int2 != null) {

                while ((int1) != null && int1 <= int2) {
                    writer.write(int1 + "\n");
                    writer.flush();
                    String line11 = br1.readLine();
                    if (line11 != null) {
                        while (line11.contains(" ")) {
                            line11 = br1.readLine();
                        }
                        Integer in1False = Integer.valueOf(line11);
                        while (in1False < int1 || line11.contains(" ")) {
                            line11 = br1.readLine();
                            in1False = Integer.valueOf(line11);
                        }
                        int1 = in1False;
                    } else
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
                while ((int2) != null && int1 > int2) {
                    writer.write(int2 + "\n");
                    writer.flush();         // запушили в файл
                    String line22 = br2.readLine();         // читаем следующую сроку затем проверка
                    if (line22 != null) {                   // на пустой пробел и
                        while (line22.contains(" ")) {
                            line22 = br2.readLine();
                        }
                        Integer in2False = Integer.valueOf(line22);     // проверка на то чтобы прочитанная строка
                        while (in2False < int2 || line22.contains(" ")) {   // была больше записанного последнего чисда
                            line22 = br2.readLine();            // если меньше, то снова читаем, проверяем на пустой и на больге или нет
                            in2False = Integer.valueOf(line22);
                        }
                        int2 = in2False;        // если пробела нет и число больше, записываем его в рабочее в число.
                    } else      // если файл первый кончился выполняется дальнейшая перезапись второго файла.
                        while ((int1) != null) {
                            writer.write(int1 + "\n");
                            writer.flush();
                            String line11 = br1.readLine();
                            if (line11 != null) {
                                while (line11.contains(" ")) {
                                    line11 = br1.readLine();
                                }
                                Integer in1False = Integer.valueOf(line11);
                                while (in1False < int1 || line11.contains(" ")) {
                                    line11 = br1.readLine();
                                    in1False = Integer.valueOf(line11);
                                }
                                int1 = in1False;
                            } else
                                int1 = null;
                            int2 = null;
                        }
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void MergeDescending(File fileName1, File fileName2, File fileName3) {
        try (BufferedReader br1 = new BufferedReader(new FileReader(fileName1));
             BufferedReader br2 = new BufferedReader(new FileReader(fileName2));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName3))) {
            String line1 = br1.readLine();
            String line2 = br2.readLine();
            Integer int1 = null;
            Integer int2 = null;
            if (line1 != null) { //проверка на пустой файл
                int1 = Integer.parseInt(line1);
            } else { // файл пуст то этот код копируем второй файл
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
            if (line2 != null) { // проверяем второй файл на пустоту
                int2 = Integer.parseInt(line2);
            } else {
                while ((int1) != null) {
                    writer.write(int1 + "\n");
                    writer.flush();
                    String line11 = br1.readLine();
                    if (line11 != null) {
                        while (line11.contains(" ")) {
                            line11 = br1.readLine();
                        }
                        Integer in1False = Integer.valueOf(line11);
                        while (in1False > int1 || line11.contains(" ")) {
                            line11 = br1.readLine();
                            in1False = Integer.valueOf(line11);
                        }
                        int1 = in1False;
                    } else
                        int1 = null;
                    int2 = null;
                }
            }
            // пошло основное действие.
            while (int1 != null || int2 != null) {

                while ((int1) != null && int1 >= int2) {
                    writer.write(int1 + "\n");
                    writer.flush();
                    String line11 = br1.readLine();
                    if (line11 != null) {
                        while (line11.contains(" ")) {
                            line11 = br1.readLine();
                        }
                        Integer in1False = Integer.valueOf(line11);
                        while (in1False > int1 || line11.contains(" ")) {
                            line11 = br1.readLine();
                            in1False = Integer.valueOf(line11);
                        }
                        int1 = in1False;
                    } else
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
                while ((int2) != null && int1 < int2) {
                    writer.write(int2 + "\n");
                    writer.flush();         // запушили в файл
                    String line22 = br2.readLine();         // читаем следующую сроку затем проверка
                    if (line22 != null) {                   // на пустой пробел и
                        while (line22.contains(" ")) {
                            line22 = br2.readLine();
                        }
                        Integer in2False = Integer.valueOf(line22);     // проверка на то чтобы прочитанная строка
                        while (in2False > int2 || line22.contains(" ")) {   // была больше записанного последнего чисда
                            line22 = br2.readLine();            // если меньше, то снова читаем, проверяем на пустой и на больге или нет
                            in2False = Integer.valueOf(line22);
                        }
                        int2 = in2False;        // если пробела нет и число больше, записываем его в рабочее в число.
                    } else      // если файл первый кончился выполняется дальнейшая перезапись второго файла.
                        while ((int1) != null) {
                            writer.write(int1 + "\n");
                            writer.flush();
                            String line11 = br1.readLine();
                            if (line11 != null) {
                                while (line11.contains(" ")) {
                                    line11 = br1.readLine();
                                }
                                Integer in1False = Integer.valueOf(line11);
                                while (in1False > int1 || line11.contains(" ")) {
                                    line11 = br1.readLine();
                                    in1False = Integer.valueOf(line11);
                                }
                                int1 = in1False;
                            } else
                                int1 = null;
                            int2 = null;
                        }
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

