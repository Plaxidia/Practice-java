package org.plaxidia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class lab2 {

    public static void main(String[] args) {

        int[] arr = {4, 6, 19, 2, 7, 12, 1, 9};
        int[] result =multiplication();
        System.out.print("Elements before  sorting are : ");
        Descending(arr);
        System.out.print("Elements after sorting Descending(arr); are : ");
        Ascending(arr);
        System.out.print("Elements after sorting ascending(arr); are : ");
        multiplication();
        System.out.print("Elements before  multiplication are : ");

        System.out.print("Elements after   multiplication are : "+ Arrays.toString(result));

        assert result != null;

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<>();
        int n;
        while (true) {
            System.out.println("enter a number");
            n = s.nextInt();
            if (n == 0)
            {
                break;
            }
            A.add(n);

        }

        System.out.println(" You entered the number");
        int i =0 ;
        while (i<A.size()) {
            System.out.println(A.get(i)+ "");
            i++;
        }
    }
    static void Descending(int[] arr)
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
    static void Ascending(int[] arr)
    {
        int n = arr.length;
        int temp ;
        for (int i = 0; i < n; i++)
        {

            for  (int j=1;j < (n - i);j++)
            {
                if (arr[j - 1] > arr[j])
                {
                    //swap
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }
    static int[] multiplication()
    {
        int  result = 3;
        System.out.println("array before multiplying ");
        for (int j =1;j<=10;++j)
        {
            result = result * j;
            System.out.println("the product") ;

        }

        return null;
    }
}

