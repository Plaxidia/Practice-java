package org.plaxidia;

public class Main {

    public static void main(String[] args) {
	// write your code here
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
}
