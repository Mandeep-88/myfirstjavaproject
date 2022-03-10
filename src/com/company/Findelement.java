package com.company;

import java.util.Scanner;

public class Findelement {
    public static void main(String[] args) {
        int arr[]={1,2,4,6,7,9};
        System.out.println("Enter the no4");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int elementAtIndex = findElementAtIndex(index, arr);
        if(elementAtIndex==-1){
            System.out.println("Invalid input");
        }
    }
    public static int findElementAtIndex(int index, int arr[]){
        if(index>=arr.length){
            return -1;
        }
        return arr[index];
    }
}
