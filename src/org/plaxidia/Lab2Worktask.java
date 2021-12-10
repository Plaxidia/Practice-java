package org.plaxidia;

import java.util.Scanner;

public class Lab2Worktask {
    public static void main(String[] args) {

        int n ;
        int temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        // working with if
        System.out.println("Enter  the elements 1,2 or 3 :");
        for (int i = 0; i >= n; i++)
        {

            if (i==1){
                System.out.println("You entered number 1");
            }else if (i==2) {
                System.out.println("You entered number 2");
            }else if (i==3){
                System.out.println("You entered number 3");
            }else
                    System.out.println("You entered that is not 1 , 2 or 3::wrong  number ");

        }
        //Working with array
        int a[] = new int[n];

        for (int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < n - 1; i++)
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
        //working with while
        {
            int i = 1;
            while (i <= n) {
               System.out.println("cycle goes on!"+i);
               if (i==n)
                   break;
               i++;
            }
        }


    }




}
