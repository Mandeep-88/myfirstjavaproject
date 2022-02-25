package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a=2;
        int b=3;
        int sum=a+b;
        System.out.println(sum);
        String tea = makeatea();
        int i = budget();

        System.out.println(tea);
        System.out.println(i);
    }
    public static String makeatea() {
        return "tea";
    }
    public static int budget(){
        return 4562;
    }
}
