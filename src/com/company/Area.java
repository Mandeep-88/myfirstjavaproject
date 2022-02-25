package com.company;
import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        System.out.println("Print the number of month");

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        printmonth(month);

    }

    public static void printmonth(int month){
        if (month <= 4 && month <= 7 && month <= 6)
            System.out.println("The number of days in a month are 31 days");

    }
}

