package com.cs61b.OOP.Poly;

public class Maximizer {
    public static Comparable max(Comparable[] items) {
        int maxIdx = 0;
        for (int i = 0; i < items.length; i++) {
            int comp = items[i].compareTo(items[maxIdx]);
            if (comp > 0) {
                maxIdx = i;
            }
        }
        return items[maxIdx];
    }

    public static void main(String[] args) {
        Dog[] dogs = {new Dog("Papi", 10), new Dog("Haha", 18), new Dog("Hulu", 30)};
        Dog maxDog = (Dog) max(dogs);
        maxDog.bark();
    }
}
