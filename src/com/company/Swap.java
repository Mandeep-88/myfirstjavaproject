package com.company;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        System.out.println("Enter the first no");
        Scanner input= new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Enter the second no");
        int b = input.nextInt();
        System.out.println("before swapping a = "+a + "\t"+"b = "+ b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping  a = "+a +"\t"+"b = "+ b);

    }
}
