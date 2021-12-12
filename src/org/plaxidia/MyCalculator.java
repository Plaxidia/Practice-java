package org.plaxidia;


import java.util.Scanner;


public class MyCalculator {


    public static void main(String[] args){
        System.out.println("Hello this is my calculator!");
        getInt();
        getOperation ();
        calculate ();
    }

    public static void getInt()
    {
        Scanner myInput = new Scanner( System.in );  // Create Scanner object
        // Declare the variables
        int a;
        int b;
        System.out.print( "Enter first integer: "  ); // Input the integer
        a = myInput.nextInt();// Read the next integer from the screen
        System.out.print( "the value of a is =: " +a  );// Display the integer

        System.out.print( "Enter second integer: " ); // Input the integer
        b = myInput.nextInt();
        // Read the next integer from the screen
        System.out.print( "the value of b= : " +b );// Display the integer
    }
    
     private static void getOperation() {

         Scanner scanner = new Scanner(System.in);
         System.out.println(" Select between (*,/,+,-): ");
         String op = scanner.next();
         String sign = "You have selected ";
         switch (op) {
             case "*":
                 System.out.println("*" + "the entered sign is :*" + sign);
                 break;
             case "/":
                 System.out.println("/ " + "the entered sign is :" + sign);
                 break;
             case "+":
                 System.out.println("+" + "the entered sign is :" + sign);
                 break;
             case "-":
                 System.out.println("_" + "the entered sign is :" + sign);
                 break;
             default:
                 System.out.println("\"the entered sign is \"+sign");
         }
         scanner.close();
     }
     public static  void calculate (){
        int answer ;
        int x  ;
        int y;
        boolean go = true;    //sets up loop

        while(go)    //creates loop to top
        {
            Scanner scan = new Scanner(System.in);    //sets up scanners
            Scanner scan1 = new Scanner(System.in);


            String sign = scan.nextLine();    //tells comp. to take user input

            if("a".equals(sign))    //addition
            {
                System.out.println("Enter first integer: .");
                x = scan.nextInt();
                System.out.println("Enter the second integer:.");
                y= scan.nextInt();
                answer = x + y;
                System.out.println(x + " added to " + y+ " equals " + answer + "!");
            }
            if("s".equals(sign))    //subtraction
            {
                System.out.println("Enter first integer:");
                int sub1 = scan.nextInt();
                System.out.println("Enter the second integer:");
                int sub2 = scan.nextInt();
                int sub3 = sub1 - sub2;
                System.out.println(sub1 + " subtracted by " + sub2 + " equals " + sub3 + "!");
            }
            if("m".equals(sign))    //multiplication
            {
                System.out.println("Enter first integer:");
                int mul1 = scan.nextInt();
                System.out.println("Enter the second integer:");
                int mul2 = scan.nextInt();
                int mul3 = mul1 * mul2;
                System.out.println(mul1 + " multiplied by " + mul2 + " equals " + mul3 + "!");
            }
            if("d".equals(sign))    //division
            {
                System.out.println("Enter first integer:");
                int div1 = scan.nextInt();
                System.out.println("Enter the second integer:");
                int div2 = scan.nextInt();
                int div3 = div1 / div2;
                System.out.println(div1 + " divided by " + div2 + " equals " + div3 + "!");
            }


            System.out.println("Would you like to start over? (yes,no)");
            String startOver = scan1.nextLine();

            if("no".equals(startOver))
            {
                go = false;
                System.out.println("good bye");
            }
        }
    }


     }

}
