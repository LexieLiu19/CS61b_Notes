package com.cs61b.OOP;

public interface List61B<Item> {

    void addFirst(Item x);

    void addLast(Item y);

    Item getFirst();

    Item getLast();

    Item removeLast();

    Item getAtIndex(int index);

    void insertAt(Item x, int index);

    int size();
}
