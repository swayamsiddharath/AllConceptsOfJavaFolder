//Takes input from the user and make them guess the correct number.
package com.apnacollege;
import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
     int myNumber =(int)( Math.random()*100);
        int userNumber=0;
     do {
         System.out.println("Guess my number(1-100)");
         userNumber = sc.nextInt();
         if(userNumber == myNumber)
         {
             System.out.println("Woohoo You won");
             break;
         }
         else if (userNumber>myNumber)
         {
             System.out.println("Number is large");
         }
         else{
             System.out.println("Your number is too small");
         }
     } while(userNumber >=0);
        System.out.println("My number was: ");
        System.out.println(myNumber);
    }
}
