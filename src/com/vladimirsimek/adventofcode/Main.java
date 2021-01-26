package com.vladimirsimek.adventofcode;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
            bw.write("Hello world!");
            for (int i = 0; i < 2; i++) {
                bw.newLine();
                bw.write("Hello world!");
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt", true));
            bw.newLine();
            bw.newLine();
            bw.write("100 LINES INCOMING!");
            bw.newLine();
            bw.newLine();

            bw.write("Hello world!");
            for (int i = 0; i < 100; i++) {
                bw.newLine();
                bw.write("Hello world!");
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Successfully written Hello world 3 times.");
        String helou = "hi";
        int af = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("in.txt"));
            while (helou != null) {
                String sup = "";
                helou = br.readLine();
                sup = helou.replaceAll("N ", "-");
                af += Integer.parseInt(sup);
            }
            while (helou != null) {
                String supsew = "";
                helou = br.readLine();
                supsew = helou.replaceAll("P ", "+");
                af += Integer.parseInt(supsew);
            }
        } catch (Exception e) {
            System.out.println("hey");
        }
        System.out.println(af);
    }
}
