package org.plaxidia;


import java.util.Scanner;

public class lab2 {

    public static void main(String[] args) {


        int[] arr = {2,2,3,4,4,5,8,6};

        Ascending(arr);
        Descending(arr);
        multiplication();
        addnumber();

        addingSequence();
        MultiplyingSequence();
    }
    static void Ascending(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                int tmp;
                if (arr[i] > arr[j])
                {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            //prints the sorted element of the array
            System.out.println("Array elements in ascending order:");
            for (i = 0; i <=arr.length - 1; i++)
            {
                System.out.println(arr[i]);
            }
        }
    }
    static void Descending(int[] arr)
    {
        int temp ;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] < arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array elements in descending order:");
        //accessing element of the array
        for (int i = 0; i <=arr.length - 1; i++)
        {
            System.out.println(arr[i]);
        }

    }
    static void multiplication()
    {
        System.out.print("Elements after  multiplying by  :");
        int  result ;
        int n=3;
        for (int j =1;j<=10;++j)
        {
            result = n* j;//j is the in index
            System.out.println(result) ;

        }

    }



    public static void addnumber() {
        Scanner scan = new Scanner(System.in);
        int m = 5;
        int answer = 0;
        int n;
        System.out.print("Enter an integer: ");
        n = scan.nextInt();


        //System.out.print("Enter an integer: ");
        while (n <= m)
        {
            answer = answer + n;
            ++n;
            System.out.println("the answer =" + answer);


        }
    }
    public static void addingSequence ()
        {
            System.out.println("the next number is :");

            int f = 7;
            int p = 7;

            while (f <= 98) {
                int t;
                System.out.println(" print  adding sequence :" + f);
                t = f + p;
                p = f;
                f = t;
            }
            System.out.println(" ");


        }
        public static void MultiplyingSequence ()
        {
            int a = 2;
            int b = 1;

            while (a <= 32) {
                int t;
                System.out.println(" print MultiplyingSequence " + a);
                t = a * b;
                b = a;
                a = t;

            }
        }

}

