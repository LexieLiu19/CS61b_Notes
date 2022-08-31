package com.cs61b.JavaBasic;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] someArray = new int[5];
        someArray[0] = 2;
        someArray[1] = 4;


        Dog_With_Constructor[] dogs = new Dog_With_Constructor[2];
        dogs[0] = new Dog_With_Constructor(10);
        dogs[1] = new Dog_With_Constructor(40);
        dogs[1].makeNoise();
        dogs[0].makeNoise();


    }
}
