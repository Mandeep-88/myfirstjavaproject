package com.company;

public class calculator {
    public static void main(String[] args) {
        // Sum
        int s = sum(2, 8);
        System.out.println("Shows the value of sum is "+s);

        // Multiply

        int mul = multiply(5, 4);
        System.out.println("Shows the value of multiply");
        System.out.println(mul);
        //Divide
        float div = divide(15, 3);
        System.out.println("Shows the value of division");
        System.out.println(div);
        //Difference
        int dif = difference(8, 4);
        System.out.println("Shows the value of difference");
        System.out.println(dif);

    }
    public static int sum(int a,int b) {
        return  a+b;

    }

    public static int multiply(int a,int b) {
        return  a*b;

    }
    public static float divide(int a,int b) {
        return  a/b;

    }
    public static int difference (int a,int b) {
        return  a-b;

    }
}
