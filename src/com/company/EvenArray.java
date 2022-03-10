package com.company;

public class EvenArray {
    public static void main(String[] args) {
        int array[]= {3,2,8,1,4,7};
        int even = countEven(array);
        System.out.println("The count number of even numbers in array"+" "+even);

    }
    public static int countEven(int array[]){
        int count = 0;
        for(int i=0; i<array.length ;i++){
            if (array[i]%2==0)
            {
                count++;
            }

        }
        return count;
    }
}
