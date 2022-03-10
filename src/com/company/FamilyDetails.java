package com.company;

public class FamilyDetails {
    public static void main(String[] args) {
        Family f1 = new Family("Tom","Marry","Joe","siya",1234,4567,546,789);
        //System.out.println(f1.displayNames());

        System.out.println(f1.totalSalary());
        System.out.println(f1.totalFees());
        System.out.println(f1.totalSaving());
        System.out.println(f1.messageToDad());

    }
}