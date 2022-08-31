package com.cs61b.OOP;

public class RotatingList<Item> extends LinkedList<Item> {


    public static void main(String[] args) {
        RotatingList rl = new RotatingList();
        rl.addFirst(100);
        rl.addFirst(200);
        rl.addFirst(300);
        rl.rotateRight();
        rl.print();

    }

    public void rotateRight() {
        Item x = removeLast();
        addFirst(x);
    }
}
