package com.cs61b.OOP.HoF;

public class HoFDemo {
    public static int doTwice(IntUnaryFunction f, int x) {
        return f.apply(f.apply(x));
    }

    public static void main(String[] args) {
        TenX tenX = new TenX();
        System.out.println(doTwice(tenX, 2));
    }
}
