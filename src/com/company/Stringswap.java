package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Stringswap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("trying git");
        System.out.println("Enter the string");
        String s = sc.next();
        System.out.println("Enter the index i");
        int i = sc.nextInt();
        System.out.println("Enter the index j");
        int j = sc.nextInt();
        SwapString(s,i,j);
    }
    public static void SwapString(String s, int i, int j){
        char swap[] = s.toCharArray();
        System.out.println("Enter the original string"+ Arrays.toString(swap));
        char temp=swap[i];
        swap[i] = swap[j];
        swap[j]= temp;
        System.out.println("The string after the swapping"+ Arrays.toString(swap));






    }
}
