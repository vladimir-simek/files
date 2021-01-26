package com.vladimirsimek.adventofcode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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

        System.out.println("Successfully written Hello world 3 times.");
    }
}
