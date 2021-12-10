package org.plaxidia;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Random rand = new Random();
        int[] arr =  Random();
        System.out.println("min of 10 numbers between is =" + Arrays.toString(Random()));
        System.out.println("min of 10 numbers between is =" + FindMin( arr ));
        System.out.println("max of 10 numbers  between is =" + FindMax(arr) );
        System.out.println("average of 10 numbers between  is =" + FindAverage(arr));
        System.out.println("Array before  applying Bubble Sort in ascending order:  ");
        {
            int i=0;
            while (i< arr.length) {

                System.out.print(arr[i] + " ");
                i++;
            }
        }
        System.out.println();
        bubbleAscending(arr);
        System.out.println("Array after applying Bubble Sort in ascending order: ");
        {
            int i = 0;
            while (i < arr.length) {
                System.out.print(arr[i] + " ");
                i++;
            }
        }

        System.out.println("Array before applying Bubble Sort in Descending order: ");
        {
            int i = 0;
            while (i <arr.length) {
                System.out.print(arr[i] + " ");
                i++;
            }
        }
        System.out.println();
        bubbleDescending(arr);
        System.out.println("Array after applying Bubble Sort in Descending order: ");

        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
        //removeArrayElement(arr, arr.length);


        // Print the results of the  array
        System.out.println("Original Array: " + Arrays.toString(removeArrayElement(arr, arr.length)));

        // Get the specific index
        int index = 2;

        // Print the index
        System.out.println("Index to be removed: " + index);

        // Remove the element
        arr = removeArrayElement(arr, index);

        // Print the results of the  array
        System.out.println("Results after removing the index of the  Array: "+ Arrays.toString(removeArrayElement(arr, arr.length)));

    }
    public  static int[] Random ()
    {
        int max=3 ;
        int min=-1;
        Random rand =new Random()  ;// creating Random object
        int[] arr= new int[5]  ;

        for (int n=1;n<arr.length;n++) {
            arr[n] = rand.nextInt();// storing random integers in an array
            System.out.println(rand.nextInt( (max - min + 2) + min));// printing each array element
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


        int i = 0;
        while (i < arr.length) {
            if (arr[i] < min) {
                min = arr[i];

            }
            i++;
        }
        return min;
    }

    public static int FindMax(int[] arr)
    {
        int n = 0;
        int max = arr[n];

        int i = 0;
        while (i < arr.length) {
            if (arr[i] > max)
            {
                max = arr[i];
            }
            i++;
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
 public  static int [] removeArrayElement(int [] arr,int index){


     // If the array is empty
     // or the index is not in array range
     // return the original array
     if (arr == null || index < 0
             || index >= arr.length) {

         return arr;
     }

     // Create another array of size one less
     int[] newArray = new int[arr.length - 1];

     // Copy the elements except the index
     // from original array to the other array
     for (int i = 0, j = 0; i < arr.length; i++) {

         // if the index is
         // the removal element index
         if (i == index) {
             continue;
         }

         // if the index is not
         // the removal element index
         newArray[j++] = arr[i];
     }


     return newArray;
 }

}








