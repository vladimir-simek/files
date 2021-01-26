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
        String blah = "safasf";

        ArrayList<String> bruh = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("in.txt"));
            while (br.readLine() != null) {
                br.readLine().replace("N ", "-");
                br.readLine().replace("P ", "+");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int sup = 0;
        int a = 0;
        int wut = 0;
        String sss;
        String content;
        try {
            BufferedReader br = new BufferedReader(new FileReader("in.txt"));
            while (a != 50002) {
                content = br.readLine();
                sss = content;
                sss.replace("N ", "-");
                sss.replace("P ", "+");
                wut = Integer.parseInt(sss);
                sup += wut;
                a++;
            }
        } catch (Exception e) {
            System.out.println("fuck");
        }
        System.out.println(sup);
    }
}
