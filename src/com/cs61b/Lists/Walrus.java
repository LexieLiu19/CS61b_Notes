package com.cs61b.Lists;

public class Walrus {
    public int weight;
    public double tuskSize;

    public Walrus(int w, double s) {
        weight = w;
        tuskSize = s;
    }

    public static void doStuff(Walrus w, int x) {
        w.weight = w.weight - 10;
        x = x - 5;
    }

    public static void main(String[] args) {
        Walrus a = new Walrus(100, 2.3);
        Walrus b;
        b = a;
        System.out.println(b.weight);
        int num = 10;
        doStuff(a, num);
        System.out.println(a.weight);//90 - call by reference
        System.out.println(num);// call by value

    }
}
