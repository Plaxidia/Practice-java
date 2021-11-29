package org.plaxidia;

public class Main {

    public static void main(String[] args) {
        int [] num ={8,2,1,-3,124};
        System.out.println("min of 5 numbers is =" + FindMin(num) );
       	System.out.println("max of 5 numbers is =" + FindMax(num) );
        System.out.println("average of 5 numbers is =" + FindAverage(num) );
    }
    public static int FindAverage( int [] arr)
    {
        //the average is found by dividing the sum with the number of elements
        int sum  =0;
        for(int n =1; n  < arr.length ; n++)
        {
            sum = sum + arr[n];
        }
        System.out.println(" sum " + sum );
        return sum/arr.length;
    }
    public static int FindMin (int[] arr) {
        int n = 0;
        int min = arr[n];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }
        }
        return min;
    }
        public static int FindMax (int [] arr)
        {
            int n = 0;
            int max = arr[n];

            for( int i =0;i< arr.length ;i++)
            {
                if (arr[i] >max)
                {
                    max=arr[i];
                }
            }
            return max;

        }


}
