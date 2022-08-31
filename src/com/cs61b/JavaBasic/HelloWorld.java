package com.cs61b.JavaBasic;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world from CS61b");

        int x =1;
        while(x<10){
            System.out.println(x+" ");
            x++;
        }

        String h = 5 + "hello";
        System.out.println(h);// 5hello


        int largerNum = larger(10,20);
        System.out.println(largerNum);//20
    }


    public  static  int larger(int x, int y){
        if(x>y){
            return x;
        }else{
            return y;
        }
    }
}
