package com.company;

import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        System.out.println("Enter the month number");
        Scanner sc= new Scanner(System.in);
        int month = sc.nextInt();
        printmonth(month);
    }
    public static void printmonth(int mon){
        if (mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12 ){
            System.out.println("This month has 31 days");
        }
        else if(mon == 2){
            System.out.println("This month has 28 days");
        }
        else if(mon ==4  || mon == 6 || mon == 9 || mon == 11){
            System.out.println("This month has 30 days");
        }
        else{
            System.out.println("You have entered number that not belongs to any month");
        }

    }
}
