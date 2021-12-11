package org.plaxidia;




public class lab2 {

    public static void main(String[] args) {


        int[] arr = {2,2,3,4,4,5,8,6};

        Ascending(arr);
        Descending(arr);
        int result =multiplication();
        multiplication();

        System.out.print("");
        
        addnumber();

        int n = 7;
        Nextnumber(n);
        System.out.print("Nextnumber:" + Nextnumber(n));


        //assert result != null;
        
    }
    static void Ascending(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                int tmp = 0;
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
        int n = arr.length;
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
    static int multiplication()
    {
        System.out.print("Elements after   multipliying by  :");
        int  result = 0;
        int n=3;
        for (int j =1;j<=10;++j)
        {
            result = n* j;//j is the in index
            System.out.println(result) ;

        }
        return result;
    }
    public static int addnumber(){
        System.out.println("enter a number:");
        int enterednumber =0;
        int m=5;
       for (int i=0;i<=m;i++) {

           enterednumber=enterednumber +i;
           i++;
       }
        //System.out.println(" You entered the number");
        return enterednumber ;
    }


    public static int Nextnumber(int n){

        int sum =0;
        for (int  a=7; a <= n; a++)
        {
            sum= a+n;
            sum=sum+a;

            System.out.println(sum+"="+a);
        }
        return sum;
    }

}

