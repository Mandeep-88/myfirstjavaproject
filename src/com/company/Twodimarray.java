package com.company;

public class Twodimarray {
    public static void main(String[] args) {
        {
            int arr[][] = new int[][]
                    {
                            {1, 2, 3, },
                            {4, 5, 6, },
                            {7, 8, 9, },
                            {7,8,9},
                            {2,5,9}
                    };
            //System.out.println(arr[0][3]);
            for (int row = 0; row <arr.length; row++) {
                int s=0;
                int avg;

                for (int col = 0; col <arr[0].length; col++) {
                    //s=s+arr[row][col];
                    s=s+arr[col][row];
                    //System.out.print(arr[row][col]+" ");
                    //System.out.println(s);
                }
                avg=s/3;
                System.out.println("the average of the colum is "+ avg);
            }
        }

    }}