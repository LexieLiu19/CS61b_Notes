package com.cs61b.JavaBasic;

public class Dog_With_Constructor {
  public   int weightInPounds;

  public Dog_With_Constructor(int w){
      weightInPounds = w;
  }

  public  void  makeNoise(){
      if(weightInPounds<10){
          System.out.println("Yipyipyip!");
      }else if (weightInPounds<30){
          System.out.println("bark, bark.");
      }else{
          System.out.println("Woof!");
      }
  }

    public static void main(String[] args) {
        Dog_With_Constructor d = new Dog_With_Constructor(20);
        d.makeNoise();

    }

}
