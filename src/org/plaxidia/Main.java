package org.plaxidia;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Random rand = new Random();
        int[] arr =  Random();
        System.out.println("min of 10 numbers between is =" + FindMin( arr ));
        System.out.println("max of 10 numbers  between is =" + FindMax(arr) );
        System.out.println("average of 10 numbers between  is =" + FindAverage(arr));
        System.out.println("Array before  applying Bubble Sort: ");
        for (int i=0;i< arr.length;i++){

            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubbleAscending(arr);
        System.out.println("Array after applying Bubble Sort in ascending order: ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }



        System.out.println("Array before applying Bubble Sort: ");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubbleDescending(arr);
        System.out.println("Array after applying Bubble Sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

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

        for(int i = 0; i < arr.length; i++)
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
        int temp ;
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
    static void bubbleDescending(int[] arr)
    {
        int n = arr.length;
        int temp ;
        for (int i = 0; i < n; i++)
        {
            for (int j = 1; j < (n - i); j++)
            {
                if( arr[j - 1] < arr[j])
                {
                    //swap

                    temp =arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
 //remove elements
}






