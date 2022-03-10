package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SixthAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enyer the numbers" );
        int n = sc.nextInt();
        int value = sumMultiples(n);
        System.out.println("The sum of all multiples of three and five"+" "+ value);


    }


    public static int sumMultiples(int n){
        int sum = 0;
        for(int i=1;i<=n;i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }
return sum;


    }
}
