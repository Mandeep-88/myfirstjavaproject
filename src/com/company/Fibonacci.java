package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();

        int n1=0;
        int n2=1;

        System.out.println("The Result of the fibonacci series "+ num + " "+ " is :");
//        for(int i=1;i<=num;i++){
//            System.out.print(n1 +" ,");
//            n1 = n2;
//            n2 = n3;
//            n3 = n1+n2;
//        }
        // While loop
        int i =1;
        while(i<=num){
            System.out.println(n1+" , ");
            int n3= n1+n2;
            n1=n2;
            n2=n3;
            i++;
        }
    }
}
