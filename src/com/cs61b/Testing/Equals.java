package com.cs61b.Testing;

import java.util.Arrays;

public class Equals {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        if (a == b) {
            System.out.println("address equals!");
        }


        if (Arrays.equals(a, b)) {
            System.out.println("a=b");
        }
    }
}
