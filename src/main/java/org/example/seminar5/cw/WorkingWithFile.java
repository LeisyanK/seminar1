package org.example.seminar5.cw;

import java.io.*;

public class WorkingWithFile {
    public static void main(String[] args) {
        // отдельно запись в файл
        try {
            File newfile = new File("test.txt");
            if(!newfile.exists()) newfile.createNewFile();

            PrintWriter pw1 = new PrintWriter(newfile);
            pw1.println("Записали какой-то текст.");
            pw1.close();
        } catch(IOException e) {
            System.out.println("Error: " + e);
        }

        // чтение из файла
        BufferedReader br1 = null;
        try {
//            File newfile = new File("test.txt");  // это только для записи в файл
//            if(!newfile.exists()) newfile.createNewFile();

            br1 = new BufferedReader(new FileReader("test.txt"));
            String line1;
            while ((line1 = br1.readLine()) != null) {
                System.out.println(line1);
            }
        } catch(IOException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                br1.close();
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        }

        // запись и чтение в одном коде
//        BufferedReader br = null;
//        try {
//            File file = new File("text.txt");
//            if (!file.exists()) file.createNewFile();
//
////            PrintWriter pw = new PrintWriter(file);
////            pw.println("Россия идет впереди всей планеты. Планета - это Россия.");
////            pw.close();
//
//            br = new BufferedReader(new FileReader(("text.txt")));
//            String line;
//            while ((line = br.readLine()) != null)
//            {
//                System.out.println("Из файла: "+line);
//            }
//        } catch(IOException e) {
//            System.out.println("Error: " + e);
//        } finally {
//            try {
//                br.close();
//            } catch(IOException e) {
//                System.out.println("Error: " + e);
//            }
//        }
//        String text = "Россия идет впереди всей планеты. Планета - это Россия.";
//        System.out.println(findWords(text));
    }
}
