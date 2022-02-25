package com.company;

import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the Three numbers");

        Scanner sc = new Scanner(System.in);
        int num1  = sc.nextInt();
        int num2  = sc.nextInt();
        int num3  = sc.nextInt();
        printnumber(num1, num2, num3);

    }
    public static void printnumber(int a, int b, int c)
    {
        if (a == b && b == c)
    {
        System.out.println("The three number are equal");

    }
        else{
        System.out.println("The numbers are not equal");
    }
    }
}
