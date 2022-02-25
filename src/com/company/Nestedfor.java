package com.company;

import java.util.Scanner;

public class Nestedfor {
    public static void main(String[] args) {
//        for( int i =1; i<=4;i++){
//            for( int j =1; j<=i;j++){
//                System.out.print(j  +"\t");
//            }
//            System.out.print("\n");

        Scanner sc =new Scanner(System.in);
        int computernum = (int) ((Math.random()) * 100);
        System.out.println(computernum);
        System.out.println("Guess the number");
        while(true) {
            int userinput = sc.nextInt();
            if (userinput == computernum) {
                System.out.println("you won");
                break;
            }
            else if (computernum > userinput){
                System.out.println("The computer number is greater than user input");
            }
            else if (computernum < userinput){
                System.out.println("The computer number is lesser than than user input");
            }
            System.out.println("Sorry u loose");
        }



        }
    }

