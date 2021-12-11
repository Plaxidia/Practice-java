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
        String str = "One two       three\n four\tfive ";
        System.out.println(" No of words =: " + countWords(str));
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
        while (n <= m)
        {
            System.out.println("the answer =");
            answer = answer + n;
            ++n;
            //System.out.println("the answer =" + answer);
            System.out.println( answer);
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
    // Function to count total number of words in the string
    public static int countWords(String str)
    {

        // Check if the string is null
        // or empty then return zero
        if (str == null || str.isEmpty())
            return 0;
        int wordCount = 0;

        boolean isWord = false;
        int endOfLine = str.length() - 1;

        // Converting the given string into a character array
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {

            // Check if the character is a letter and index of character array is not equal to end of line that means, it is a word and set isWord by true
            if (Character.isLetter(ch[i]) && i != endOfLine)

                isWord = true;

                // Check if the character is not a letter that means there is a space, then we increment the wordCount by one and set the isWord by false
            else if  (!Character.isLetter(ch[i]) && isWord) {

                wordCount++;
                isWord = false;
            }

            // Check for the last word of the sentence and increment the wordCount by one
            else if (Character.isLetter(ch[i]) && i == endOfLine)
                wordCount++;
        }

        // Return the total number of words in the string
        return wordCount;

    }


}

