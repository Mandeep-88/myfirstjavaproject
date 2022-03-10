package com.company;

import java.util.Calendar;

public class Calobj {
    public static void main(String[] args) {
       NewCalculator c1 = new NewCalculator();
        System.out.println("The result of the sum is :");
      System.out.println(c1.sum(4,4));;
      NewCalculator c2 = new NewCalculator();
        System.out.println("The result of the multiplication is :");
        System.out.println(c2.mul(48.5,85));
    }
}
