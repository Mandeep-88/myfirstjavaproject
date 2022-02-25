package com.company;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the marks of first subject");
        int s1 = sc.nextInt();

        System.out.println("Enter the marks of second subject");
        int s2 = sc.nextInt();

        System.out.println("Enter the marks of third subject");
        int s3 = sc.nextInt();

        System.out.println("Enter the marks of fourth subject");
        int s4 = sc.nextInt();

        System.out.println("Enter the marks of fifth subject");
        int s5 = sc.nextInt();
        grades(s1,s2,s3,s4,s5);
    }
    public static void grades( int a, int b, int c, int d, int e)
    {
        int marks= a +b+ c+ d+ e;
        float percentage = ((marks*100)/500);
        System.out.println("You have Scored " + percentage + " %");
        if(percentage>= 80){
            System.out.println(" You have got A grade");
        }

        else if(percentage >=70 && percentage < 80){
            System.out.println("You have got B grade");
        }
        else if(percentage >=60 && percentage <70){
            System.out.println("You have got C grade");
        }
        else if(percentage <60){
            System.out.println("You have got D grade");
        }
        else{
            System.out.println("Sorry you're Fail");
        }

    }
}
