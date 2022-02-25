package com.company;

import java.util.Scanner;

public class Switchoperator {
    public static void main(String[] args) {
        System.out.println("Enter the operator +,-,*,/");
        Scanner input=new Scanner(System.in);
        char calculator = input.next().charAt(0);
        System.out.println("Enter the first no");
        int a= input.nextInt();
        System.out.println("Enter the second number");
        int b= input.nextInt();
        int result;


        switch(calculator){
            case '+':
                result=a+b;

                System.out.println("The answer is "+ result);
                break;
            case '-':
                result=a-b;

                System.out.println("The answer is "+ result);
                break;
            case '*':
                result=a*b;

                System.out.println("The answer is "+ result);
                break;

            case '/':
                result=a/b;
                System.out.println("The answer is "+ result);
                break;
            default:
                System.out.println("Invalid operator");

        }


    }
}
