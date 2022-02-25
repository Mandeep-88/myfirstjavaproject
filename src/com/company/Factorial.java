package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        printfactorial(num);
    }
public static void printfactorial (int number)
       {

          int fact=1;
            for(int i=1; i<=number; i++){
                fact =  fact * i; }
           System.out.println("The factorial of" + " "+number+ " is " +" "+fact);
       }

}
