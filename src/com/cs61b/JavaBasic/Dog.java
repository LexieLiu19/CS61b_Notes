package com.cs61b.JavaBasic;

public class Dog {
    public int weightInPounds;

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.weightInPounds = 20;
//        d1.makeNoise();


        Dog d2 = new Dog();
        d2.weightInPounds = 10;

        Dog res = Dog.maxDog(d1, d2);
        res.makeNoise();

        Dog res2 = d1.maxDog2(d1);
        res2.makeNoise();
    }

    public static Dog maxDog(Dog d1, Dog d2) {
        if (d1.weightInPounds > d2.weightInPounds) {
            return d1;
        }

        return d2;
    }

    public Dog maxDog2(Dog d) {
        if (this.weightInPounds > d.weightInPounds) {
            return this;
        }
        return d;
    }

    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yipyipyip!!");
        } else if (weightInPounds < 30) {
            System.out.println("bark, bark.");
        } else {
            System.out.println("Woof, woof!!");
        }
    }
}
