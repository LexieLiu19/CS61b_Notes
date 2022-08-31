package com.cs61b.Lists;

public class IntNode {
    public int item;
    public IntNode next;

    public IntNode(int item, IntNode next) {
        this.item = item;
        this.next = next;
    }


    public int size() {
        if (next == null) {
            return 1;
        }
        return 1 + this.next.size();
    }

    public int iterativeSize() {
        IntNode p = this;
        int totalSize = 0;
        while (p != null) {
            totalSize += 1;
            p = p.next;
        }
        return totalSize;
    }

    public int get(int idx) {
        if (idx == 0) {
            return item;
        }
        return next.get(idx - 1);
    }
}
