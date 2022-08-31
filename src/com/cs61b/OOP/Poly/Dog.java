package com.cs61b.OOP.Poly;

public class Dog implements Comparable<Dog> {


    private final String name;
    private final int size;


    public Dog(String theName, int theSize) {
        name = theName;
        size = theSize;
    }

    public void bark() {
        System.out.println(name + " says: Bark!");
    }

    /* return negative if this is less than o;
     *  return 0 if this equals o;
     * return positive if this is larger than o;
     * */
    @Override
    public int compareTo(Dog theDog) {
        return this.size - theDog.size;
    }
}
