package com.company;

public class Starpattern {
    public static void main(String[] args) {
        for( int i=10;i>=1;i--){
            for ( int j=1; j<=i;j++){
                System.out.print("*"+"\t");
            }
            System.out.println("\n");
        }
    }
}
