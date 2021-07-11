package com.apnacollege;

import java.util.Scanner;

public class Dowhileexample {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number =0;
        do {
            System.out.println("Input a number");
             number = sc.nextInt();
            System.out.print("here is the number  : ");
            System.out.println(number);


        } while(number >=0);

        System.out.println("THE END");

    }
}
