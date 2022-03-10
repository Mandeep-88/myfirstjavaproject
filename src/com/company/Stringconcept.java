package com.company;

import java.util.Arrays;

public class Stringconcept {
    public static void main(String[] args) {
        String n1="Mandeep";
        char[] chars = n1.toCharArray();
        char [] reverseArr = new char [n1.length() ];
        int length = chars.length;
        int lastindex= length- 1;

        for(int i=0; i<=lastindex; i++){
            reverseArr[lastindex -i] = chars[i];
        }
String reverse= new String(reverseArr);
        System.out.println(reverseArr);
        //System.out.println(Arrays.toString(chars));
//        for(int i=0;i<chars.length;i++){
//            System.out.println(chars[i]);
//        }
        String n2="Kaur";
        System.out.println(n1.equals(n2));
    }
}
