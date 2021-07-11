package com.apnacollege;


import java.util.Scanner;

public class ComparisonOperators {

    public static void main(String[] args)
    {
      // a == b
        // not equal to (!) = a  !=  b
        // a < b
        // a > b
        // a <= b
        // a >= b

        // Conditional Statement
/*
        Boolean sunup = false;
        if(sunup==true)
            System.out.println("day");
        else
            System.out.println("night");


 */

        /*
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();


       // int age = 17;
        if (age >= 18)
            System.out.println("You are Ready to Vote");
        else
            System.out.println("Try Next Time");

         */

        // Logical Operators
        //&& AND ( if both the statements are true, then final result is true.)
       // int a = 30;
      //  int b = 40;
        /*
        if(a<50 && b<50)
            System.out.println("Both less than 50");

         */



        // || (Logical OR) ( if any one is true; then result is true)
        /*

        if (a<50 || b <50)
            System.out.println("Atleast one less than 50");

         */


       /* boolean adult = false;
       // if(!adult) // Negation marks
             if(adult)
            System.out.println("you are adult");
        else
            System.out.println("Not adult");

        */

        // Conditional Statements Examples

        // If the value of the pen is rs 10 and notebook is rs 30. Input cash from user
        //then determine whether they can buy the product or not.

Scanner sc = new Scanner(System.in);
        System.out.println("How many cash you have");
        int cash = sc.nextInt();
        if ( cash < 10)
        {
            System.out.println("cannot buy anything");
            System.out.println("get more cash");
        }


            else if( cash >= 10 && cash <50)
        {
            System.out.println("Can get 1 thing");
        }
            else {
            System.out.println("Can get both");
        }

















    }
}
