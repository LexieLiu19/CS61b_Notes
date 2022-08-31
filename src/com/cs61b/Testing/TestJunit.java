package com.cs61b.Testing;

public class TestJunit {
    public static void test() {
        String[] input = {"hello", "are", "you", "ok"};
        String[] expected = {"are", "hello", "ok", "you"};

//        org.junit.Assert.assertEquals(expected, input);
    }


    public static void main(String[] args) {
        test();
    }

}
