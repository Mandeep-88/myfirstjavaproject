package com.company;

public class PrintTable {
    public static void main(String[] args) {
        table(4);

    }
    public static void table( int n){

        System.out.println(n + "*1=" + (n*1));
        System.out.println(n + "*2=" + (n*2));
        System.out.println(n + "*3=" + (n*3));
        System.out.println(n + "*4=" + (n*4));

    }
}
