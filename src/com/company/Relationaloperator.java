package com.company;

import java.util.Scanner;

public class Relationaloperator {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        printmessage(num);


    }
    public static void printmessage(int num)
    {
      if(num>1 && num<100)
          System.out.println("Congrats");

    }

}
