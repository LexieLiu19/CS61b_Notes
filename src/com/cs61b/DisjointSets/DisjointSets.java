package com.cs61b.DisjointSets;

public interface DisjointSets {
    void connect(int p, int q);

    boolean isConnected(int p, int q);
}
