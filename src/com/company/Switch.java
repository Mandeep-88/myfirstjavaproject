package com.company;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
//        System.out.println("enter the month");
//        Scanner sc= new Scanner(System.in);
//        int month = sc.nextInt();
//
//
//        switch(month){
//             case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//                case 12:
//
//                 System.out.println("31 days");
//                 break;
//             case 2 :
//                 System.out.println("28days");
//                 break;
//
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                System.out.println("30 days");
//                break;
//
//
//
//             default:
//                 System.out.println("invalid");
//         }
//        System.out.println("Done");

        // Break statement and Continue statement
        for (int i=1; i<=10;i++){
            System.out.println("iteration no: "+ i);
            System.out.println("line 2");
            System.out.println("line 3");
            if(i==5){
                continue;
            }
            System.out.println("Line print after continue/break");
        }
    }
}
