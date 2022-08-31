package com.cs61b.IO;

import java.io.*;

public class IO {

    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/XuLiu/Courses/UCB-CS61b/Codes_2022_July/src/com/cs61b/IO/IO_Write.txt"));
        String[] names = {"Tom", "Jerry", "Mary", "John"};
        writer.write("Student Names: ");
        for (String name : names) {
            writer.write("\n" + name);
        }

        writer.close();


        BufferedReader reader = new BufferedReader(new FileReader("reader.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
    }
}
