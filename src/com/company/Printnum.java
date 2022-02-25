package com.company;

public class Printnum {
    public static void main(String[] args) {
        System.out.println("Print number 1- 100");
        for (int i=1; i<=100; i++)
        {
            System.out.println(i);
        }
//     print no 100-1
        System.out.println("Print numbers 100-1");
        for(int i=100; i>=1;i-- ){
            System.out.println(i);
        }
        // Print even no
        System.out.println("Print even no from 1-100");
        int i;
        for(i=1;i<=100;i++)
        {
        if(i%2==0){
            System.out.println(i);
            }
        }
        // Print odd no
        System.out.println("Print odd no from 1-100");

        for(i=1;i<=100;i++)
        {
            if(i%2!=0){
                System.out.println(i);
            }
        }
// print number by skip counting
        System.out.println("Print number by skipping 1");
        for( i =50; i<=100 ; i=i+2){
            System.out.println(i);

        }
    }

}
