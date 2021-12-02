package org.plaxidia;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] num = {8, 2, 1, -3, 124};
        System.out.println("min of 5 numbers is =" + FindMin(num));
        System.out.println("max of 5 numbers is =" + FindMax(num));
        System.out.println("average of 5 numbers is =" + FindAverage(num));
    }
    public  static int[] Random ()
    {
        int max=3 ;
        int min=-1;
        int[] arr= new int[5]  ;
        Random rand =new Random()  ;
        for (int n=1;n<arr.length;n++) {
            System.out.println(rand.nextInt(max - min + 1) + min);
        }
       return arr;
    }

    public static int FindAverage(int[] arr) {
        //the average is found by dividing the sum with the number of elements
        int sum = 0;
        for (int n = 1; n < arr.length; n++) {
            sum = sum + arr[n];
        }
        System.out.println(" sum " + sum);
        return sum / arr.length;
    }

    public static int FindMin(int[] arr) {
        int n = 0;
        int min = arr[n];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }
        }
        return min;
    }

    public static int FindMax(int[] arr)
    {
        int n = 0;
        int max = arr[n];

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;

    }
    static void bubbleAscending(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
}






