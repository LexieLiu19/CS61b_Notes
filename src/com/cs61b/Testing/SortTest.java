package com.cs61b.Testing;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


// ad hoc testing
public class SortTest {
    public static void main(String[] args) {

    }

    @Test
    public void test() {
        int[] input = {2, 3, 1, 0, 65};
        int[] expected = {0, 1, 2, 3, 65};
        Sort.sort(input);
        assertArrayEquals(input, expected);

    }
}
